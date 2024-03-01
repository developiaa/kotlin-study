package basic

import org.junit.jupiter.api.Test

class 상속 {
    // 상속이 가능한 상태
    open class Dog {
        open var age: Int = 0
        open fun bark() {
            println("멍멍")
        }
    }

    open class BullDog(override var age: Int = 0) : Dog() {

        override fun bark() {
            println("컹컹")
            super.bark()
        }
    }

    class ChildBullDog() : BullDog() {
        override var age: Int = 0
        override fun bark() {
            super.bark()
        }
    }

    abstract class Developer {
        abstract var age: Int
        abstract fun code(launguge: String)

    }

    class BackendDeveloper(override var age: Int) : Developer() {
        override fun code(launguge: String) {
            println("I code with $launguge")
        }
    }

    @Test
    fun main() {
        val dog = BullDog(age = 2)

        println(dog.age)
        dog.bark()

        val backendDeveloper = BackendDeveloper(age = 20)
        println(backendDeveloper.age)
        backendDeveloper.code("Kotlin")
    }
}
