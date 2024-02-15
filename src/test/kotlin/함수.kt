import kotlin.test.Test

class 함수 {

    @Test
    fun main() {
        sayHello()
        sayHello("Hi")
        // named argument
        sayHello(defaultMessage = "Hi")

        println(sum(1, 2))
        println(sum2(3, 4))
        println(sum3(5, 6))

    }


    private fun sayHello(defaultMessage: String = "hello") {
        println(defaultMessage)
    }

    // 표현식 스타일
    private fun sum(a: Int, b: Int): Int = a + b

    // 표현식 & 반환타입 생략
    private fun sum2(a: Int, b: Int) = a + b

    // 반환타입이 없는 함수는 Unit을 반환한다
    private fun sum3(a: Int, b: Int): Unit {
        println(a + b)
    }


    @Test
    fun logTest() {
        log("INFO", "인포 메시지")
        log(level = "DEBUG", "디버그 메시지")
        // named argument
        log(level = "WARN", message = "워닝 메시지")
        log("ERROR", message = "에러 메시지")
    }

    private fun log(level: String = "INFO", message: String) {
        println("[$level] $message")
    }

}
