package advanced

import org.junit.jupiter.api.Test
import java.io.FileWriter

class 고급_예외처리 {
    @Test
    fun main() {
        FileWriter("text.txt")
            .use {
                it.write("hello kotlin")
            }
    }

    @Test
    fun test() {
//        val result = try {
//            getStr()
//        } catch (e: Exception) {
//            println(e.message)
//            "기본값"
//        }

        // 위와 동일
        val result = kotlin.runCatching { getStr() }
            .getOrElse {
                println(it.message)
                "기본값"
            }

        println(result)


        val result2 = kotlin.runCatching { getStr() }
            .exceptionOrNull()

        result2?.let {
            println(it.message)
        }

    }

    @Test
    fun test3() {
        val result3 = kotlin.runCatching { getStr() }
            .getOrDefault("기본 값")
        println(result3)
    }

    @Test
    fun test4() {
        val result = kotlin.runCatching { getStr() }
            .getOrElse {
                println(it.message)
                "기본 값"
            }
        println(result)
    }

    @Test
    fun test5() {
        val result: String = kotlin.runCatching { "성공" }
            .getOrThrow()

        println("result")
    }

    @Test
    fun test6() {
        val result = kotlin.runCatching { "안녕" }
            .map{// 성공시에 원하는 값으로 셋팅
                "${it}하세요"
            }.getOrThrow()

        println(result)
    }

    @Test
    fun test7() {
        val result = kotlin.runCatching { "안녕" }
            .mapCatching{
                throw Exception("예외")
            }.getOrDefault("기본 값")

        println(result)
    }

    @Test
    fun test8() {
        val result = kotlin.runCatching { getStr() }
            .recover{
                // 실패시에 원하는 값으로 셋팅
                "복구"
            }.getOrNull()

        println(result)
    }

    @Test
    fun test9() {
        val result = kotlin.runCatching { getStr() }
            .recoverCatching{
                // 실패시에 원하는 값으로 셋팅
                throw Exception("예외")
            }.getOrDefault("복구")

        println(result)
    }
}
fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

