package advanced

import org.junit.jupiter.api.Test

fun 확장함수.printMessage(message: String) = println(message)

class 확장함수 {

    fun String.first(): Char {
        return this[0]
    }

    fun String.addFirst(char: Char): String {
        return char + this.substring(0)
    }

    fun printMessage() = println("클래스 출력")

    @Test
    fun test() {
        println("ABCD".first())
        println("ABCD".addFirst('E'))
    }
}

fun 확장함수?.printNullOrNotNull() {
    if (this == null) println("널인 경우에만 출력")
    else println("널이 아닌 경우에만 출력")
}

fun main() {
    // 시그니처가 동일한 경우에는 클래스가 먼저 호출
    확장함수().printMessage("확장 출력")

    var myExample: 확장함수? = null
    // 안전연산자를 사용하지 않았음에도 함수 내에서
    // 널 처리를 하였기 때문에 컴파일 오류가 발생하지 않음
    myExample.printNullOrNotNull()

    myExample = 확장함수()
    myExample.printNullOrNotNull()
}
