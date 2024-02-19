import org.junit.jupiter.api.Test

class 에러처리 {

    @Test
    fun test() {
        try {
            throw Exception()
        } catch (e: Exception) {
            println("에러 발생!")

        } finally {
            println("finally 실행")
        }

        // 에러는 표현식이므로 값을 받을 수 있다.
        val a = try {
            "1234".toInt()
        } catch (e: Exception) {
            println("예외 발생")
        }
        println(a)


        val b: String? = null
        val c: String = b ?: failFast("a is null")
        println(c.length)


//        failFast("예외발생!!!")
//        println("이 메시지는 출력되지 않음")
    }

    // 코드가 정상적으로 동작하지 않는 경우에는 Nothing 반환
    fun failFast(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
}
