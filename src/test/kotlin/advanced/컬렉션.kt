package advanced

import org.junit.jupiter.api.Test
import java.util.LinkedList

class 컬렉션 {

    @Test
    fun main() {
        // immutable
        val currencyList = listOf("달러", "유로", "원")
//        currencyList.add("불가능")

        // mutable
        val mutableCurrencyList = mutableListOf<String>()
        mutableCurrencyList.add("달러")
        mutableCurrencyList.add("유로")
        mutableCurrencyList.add("원")

        val mutableCurrencyList2 = mutableListOf<String>().apply {
            this.add("달러")
            add("유로")
            add("원")
        }

        // immutable set
        val numberSet = setOf(1, 2, 3, 4)

        // mutable set
        val mutableSEt = mutableSetOf<Int>().apply {
            add(1)
            add(2)
            add(3)
            add(3)
        }

        // imutable map
        val numberMap = mapOf("one" to 1, "two" to 2)


        // mutable map
        val mutableNumberMap = mutableMapOf<String, Int>()
        mutableNumberMap["one"] = 1
        mutableNumberMap["two"] = 2

        // 컬렉션 빌더는 내부에선 mutable 반환은 immutable
        val numberList: List<Int> = buildList {
            add(1)
            add(2)
            add(3)
        }

        // 컬렉션 빌더로 생성한 것 x
//        numberList.add("")

        //linkedList
        val linkedList = LinkedList<Int>().apply {
            addFirst(1)
            add(2)
            addLast(3)
        }

        // arrayList
        val arrayList = ArrayList<Int>().apply {
            add(1)
            add(2)
            add(3)
        }


        val iterator = currencyList.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
        println("====================")

        for (currency in currencyList) {
            println(currency)
        }
        println("====================")

        currencyList.forEach {
            println(it)
        }
        println("====================")

        // for loop -> map
        val lowerList = listOf("a", "b", "c")
//        val upperList = mutableListOf<String>()
//        for (lowerCase in lowerList) {
//            upperList.add(lowerCase.uppercase())
//        }
        val upperList = lowerList.map { it.uppercase() }
        println(upperList)

//        val filteredList = mutableListOf<String>()
//        for (upperCase in upperList) {
//            if (upperCase == "A" || upperCase == "C") {
//                filteredList.add(upperCase)
//            }
//        }

        // 코틀린
        val filteredList = upperList.filter { it == "A" || it == "C" }
        val filteredList3 = upperList.asSequence().filter { it == "A" || it == "C" }.toList()

        // 자바 8
        val filteredList2 = upperList.stream().filter { it == "A" || it == "C" }.toList()

        println(filteredList)
        println(filteredList2)
        println(filteredList3)



    }
}
