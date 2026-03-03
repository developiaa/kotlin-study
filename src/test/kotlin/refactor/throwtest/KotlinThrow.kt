package refactor.throwtest

import java.io.IOException
import kotlin.jvm.Throws

class KotlinThrow {

    /**
     *  `@Throws` : 기본적으로는 필요없지만 java에 try catch exception 을 하고 싶은 경우 사용
     */
    @Throws(IOException::class)
    fun throwIOException() {
        // 코틀린은 checked exception이 없다.
        throw IOException("kotlin exception")
    }
}

fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException() // 그냥 실행 됨

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()

}
