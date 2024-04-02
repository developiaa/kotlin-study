package advanced

import kotlin.test.Test

class 제너릭 {
    @Test
    fun test() {
        // 제너릭을 사용한 클래스의 인스턴스를 만드려면 타입 아규먼트를 제공
        //val generics = MyGeneric<String>("테스트")
        // 생략가능
//        val generics = MyGeneric("테스트")

        // 변수의 타입에 제너릭을 사용한 경우
        val list1: MutableList<String> = mutableListOf()

        // 타입 아규먼트를 사용한 생성자에서 추가
        val list2 = mutableListOf<String>()

        // star projection
        val list3: List<*> = listOf("테스트")
        val list4: List<*> = listOf(1, 2, 3, 4)

        // PECS Producer-Extends, Consumer-Super
        // 공변성은 자바 제너릭의 extends 코틀린에서는 out
        // 반공변성은 자바 제너릭의 super 토를린에서는 in


        val generics = MyGeneric<String>("테스트")
        val charGenerics: MyGeneric<CharSequence> = generics

    }

    @Test
    fun test2() {
        val bag = Bag<String>()
        bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))
    }
}

class MyGeneric<out T>(val t: T) {

}

class Bag<T> {
    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>,
    ) {
        to.addAll(from)
    }
}

