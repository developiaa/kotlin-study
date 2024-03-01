package basic

import org.junit.jupiter.api.Test

class 널안정성 {
    @Test
    fun test() {
        // 컴파일 에러
        // var a: String = null

        // var b: String = "11"
        // b = null

        // nullable type
        var a: String? = null

        // 컴파일 에러
        //println(a.length)
        println(a?.length)


        val b: Int = if (a != null) a.length else 0
        println(b)

        // 엘비스 연산자 - 좌변이 null인 경우 우변 리턴
        val c: Int = a?.length ?: 0
        println(c)

    }

    fun getNullStr(): String? = null

    fun getLengthIfNotNull(str: String?) = str?.length ?: 0

    @Test
    fun nullTest() {
        val nullableStr = getNullStr()

        // 컴파일 에러
//        val nullableStrLength = nullableStr.length
        // Elvis operator
        val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
        println(nullableStrLength)

        val length = getLengthIfNotNull(null)
        println(length)

        // NPE 발생, 코틀린에서 자바함수를 실행할 때도 NPE에 주의를 해야함 -> 코틀린 컴파일러가 자바는 추론을 하 지못함
        val c: String? = null
        val d = c!!.length

    }


}
