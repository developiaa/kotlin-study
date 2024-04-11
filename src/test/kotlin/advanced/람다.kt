package advanced

import kotlin.test.Test

class 람다 {

    @Test
    fun test() {
        val list = mutableListOf(printHello)

        list[0] // 함수이기 때문에 아무것도 출력되지 않음
        list[0]()

        val func: () -> Unit = list[0]
        func()

    }

    @Test
    fun test2() {
        call(printHello)
    }

    @Test
    fun test3() {
        val result = plus(1, 3)
        println(result)
    }

    //    val func: () -> String = {""}

    val printHello: () -> Unit = { println("Hello") }

    // 일급객체의 특성을 가지지 않는다. -> 변수에 대입하거나, 함수에 인자로 넣을 수 없다.
    fun printNo() = println("No!")


    // 다 같음
    val printMessage: (String) -> Unit = { message: String -> println(message) }
    val printMessage2: (String) -> Unit = { message -> println(message) }
    val printMessage3: (String) -> Unit = { println(it) }


    val plus : (Int, Int) -> Int ={a,b -> a + b}



    // 함수를 인자로 받아 실행하는 함수
    fun call(block: () -> Unit) {
        block()
    }
}
