package advanced

import org.junit.jupiter.api.Test

class 페어 {
    @Test
    fun test() {
        println(plus(1, 3))
    }

    @Test
    fun test2() {
        val plus = plus(Tuple(1, 3))
        println(plus)
    }

    @Test
    fun test3() {
        val plus = plus(Pair(1, 3))
        println(plus)

        val pair = Pair("A", 1)
        // 불변이라 변경 불가
//        pair.first = "B"
    }

    @Test
    fun test4() {
        val pair = Pair("A", 1)
        val newPair = pair.copy(first = "B")
        println(newPair)

        val second = newPair.component2()
        println(second)

        val list = newPair.toList() // immutable list
        println(list)
    }

    @Test
    fun test5() {
        val triple = Triple("A", "B", "C")
        println(triple)

        // 구조 분해 할당
        val (a: String, b: String, c) = triple
        println("$a, $b, $c")

        val list: List<String> = triple.toList()
        val (a1, a2, a3) = list
        println("$a1, $a2, $a3")
    }

    @Test
    fun test6() {
        // 구조 분해 할당
        val map = mutableMapOf("A" to "개발자", Pair("B", "디자이너"))
        for ((key, value) in map) {
            println("${key} ${value}")
        }
    }
}

fun plus(a: Int, b: Int) = a + b

// 코틀린에서는 페어를 제공함
data class Tuple(val a: Int, val b: Int)

fun plus(tuple: Tuple) = tuple.a + tuple.b

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second
