package advanced

import org.junit.jupiter.api.Test

class 람다2 {
    @Test
    fun test() {
        val list = listOf("a","b","c")
        val printStr : (String) -> Unit = { println(it)}
        forEachStr(list, printStr)

        list.forEach(printStr)

    }

    @Test
    fun test2() {
        val list = listOf("a","b","c")
        val upperCase : (String) -> String = { it.uppercase()}
        println(list.map{
            it.uppercase()
        })
        println(list.map(upperCase))
    }

    @Test
    fun test3() {
        outerFunc() // 아무런 결과도 나오지 않음
        outerFunc()() // 함수 호출해야 나옴

        val func = outerFunc()
        func()

    }

    fun outerFunc(): () -> Unit {
        return fun() {
            println("이것은 익명함수!")
        }

        // 위와 같음
//        return {
//            println("이것은 익명함수!")
//        }

    }



    // 고차함수 - 함수를 받아서 리턴하는 함수
    fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
        for (item in collection) {
            action(item)
        }
    }
}
