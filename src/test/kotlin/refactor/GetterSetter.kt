package refactor

import advanced.getStr
import org.junit.jupiter.api.BeforeEach
import sun.jvm.hotspot.debugger.Address
import java.util.UUID
import kotlin.test.Test

class GetterSetter {
    fun main() {
        // 자바 스타일
        val person = Person()
        person.setName("AA")
        person.setAge(44)
        person.setAddress("서울시")

        println(person.getName())
        println(person.getAge())

        // 코틀린 스타일
        val person2 = Person()
        person2.name = "BB"
        person2.age = 44

        println(person2.name)
        println(person2.age)

        println(person2.uuid)

    }
}
