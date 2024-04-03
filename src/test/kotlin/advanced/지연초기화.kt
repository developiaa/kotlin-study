package advanced

import kotlin.test.Test

class 지연초기화 {
    @Test
    fun test() {
        val helloBot = HelloBot()

        // 지연할당
//        helloBot.greeting = getHello()
        helloBot.sayHello()
        helloBot.sayHello()
        helloBot.sayHello()

        for (i in 1..5) {
            Thread{
                // 멀티 스레드에도 초기화로직은 한번만 수행하여 안전함
                helloBot.sayHello()
            }.start()
        }
    }
}

class HelloBot{
    // 지연할당을 쓰려면 가변인자를 써야함 -> 불변을 위해서 lazy 제공
//    var greeting: String? = null

    val greeting: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        println("초기화 로직 수행 -> 한번만 수행")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"


class LateInit{
    lateinit var text: String

    fun printText() {
        // 출력을 먼저 하게 되는 경우 exception 발생
        if (this::text.isInitialized) {
            println("초기화됨")
        } else {
            text = "안녕하세요"
        }

        println(text)
    }

    @Test
    fun test() {
        val test = LateInit()
        test.printText()
    }
}
