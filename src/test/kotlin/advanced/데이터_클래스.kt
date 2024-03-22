package advanced

import org.junit.jupiter.api.Test

class 데이터_클래스 {
    @Test
    fun test() {
        val person = Person(name = "Tony", age = 12)
        val person2 = Person(name = "Tony", age = 12)

        println(person == person2)

        val set = hashSetOf(person)
        println(set.contains(person2))
        println(person.toString())

        // 깊은 복사 - data 클래스에서만 쉽게 가능
        val person_copy = person.copy(name = "change")
        val person_copy2 = person.copy(name = "change")
        println(person_copy)
        println(person_copy == person_copy2)

        val (name, age) = person
        println(name + age)

        println("이름 = ${person.component1()}, 나이=${person.component2()}")
    }

    // data class는 equals, hashcode, tostring override 해줌
    data class Person(val name: String, val age: Int)

}
