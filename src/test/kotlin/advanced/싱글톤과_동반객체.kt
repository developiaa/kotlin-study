package advanced

import java.time.LocalDateTime
import kotlin.test.Test

class 싱글톤과_동반객체 {
    @Test
    fun test() {
        println(Singleton.a)
        Singleton.printA()
    }

    @Test
    fun test2() {
        println(DateTimeUtils.now)
        println(DateTimeUtils.now)
        println(DateTimeUtils.now)
        println(DateTimeUtils.DEFAULT_FORMAT)

        val now = LocalDateTime.now()
        println(DateTimeUtils.same(now, now))

    }

    @Test
    fun test3() {
        println(MyClass.a)
        println(MyClass.MyCompanion.a)
        println(MyClass.newInstance())
    }
}

// singleton 객체
object Singleton {
    val a = 1234

    fun printA() = println(a)
}

object DateTimeUtils {
    val now: LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }
}

class MyClass {
    private constructor()

    // 동반 객체
    companion object MyCompanion {
        val a = 1234
        fun newInstance() = MyClass()
    }
}
