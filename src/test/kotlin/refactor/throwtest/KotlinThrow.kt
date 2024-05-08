package refactor.throwtest

import java.io.IOException
import kotlin.jvm.Throws

class KotlinThrow {

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
