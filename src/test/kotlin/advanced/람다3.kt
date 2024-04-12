package advanced

import org.junit.jupiter.api.Test

class 람다3 {
    @Test
    fun test() {
        println(sum(1, 3))
        println(sum2(1, 3))
        println(sum3(1, 3))
    }

    // 람다 표현식의 전체 식
    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    // 최대한 생략한 람다 식
    val sum2 = { x: Int, y: Int -> x + y }
    val sum3: (Int, Int) -> Int = { x, y -> x + y }


    @Test
    fun test2() {
        callReference()
        callReference2()()
    }

    // 람다 레퍼런스
    val callReference: () -> Unit = { printHello() }
    val callReference2 = ::printHello

    val printHello: () -> Unit = { println("Hello") }

    @Test
    fun test3() {
        val numberList = listOf("1", "2", "3")
        numberList.map { it.toInt() }.forEach { println(it) }
        // 람다 레퍼런스
        numberList.map(String::toInt).forEach(::println)
    }

}
