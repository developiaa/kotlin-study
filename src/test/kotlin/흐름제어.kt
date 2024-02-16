import org.junit.jupiter.api.Test

class 흐름제어 {
    @Test
    fun ifTest() {
        val job = "Software Developer"

        // if else 사용
        if (job == "Software Developer") {
            println("개발자")
        } else {
            println("개발자 아님")
        }

        // 코틀린의 if else는 표현식
        val age: Int = 10

        val str = if (age > 20) {
            "성인"
        } else {
            "아이"
        }
        println(str)


        // 삼항 연산자가 없다
        val a = 1
        val b = 2
        val c = if (b > a) b else a
        println(c)
    }

    @Test
    fun whenTest() {
        val day = 2

        val result = when (day) {
            1 -> "월요일"
            2 -> "화요일"
            3 -> "수요일"
            4 -> "목요일"
            else -> "기타"
        }

        println(result)


        when (getColor()) {
            Color.RED -> println("red")
            Color.GREEN -> println("green")
            else -> println("blue")
        }

        // 여러개의 조건을 콤마로 구분할 수 있다.
        when (getNumber()) {
            0, 1 -> println("0 or 1")
            else -> println(2)
        }
    }

    enum class Color {
        RED, GREEN, BLUE
    }

    fun getColor() = Color.RED

    fun getNumber() = 2


    @Test
    fun forTest() {
        // 범위 연산자 .. -> 뒷자리를 포함
        for (i in 0..3) {
            println(i)
        }
        println()

        // 범위 연산자 until -> 뒷자리를 미포함
        for (i in 0 until 3) {
            println(i)
        }
        println()

        // step에 들어온 값 만큼 증가
        for (i in 0..5 step 2) {
            println(i)
        }
        println()

        // 값을 감소
        for (i in 3 downTo 1) {
            println(i)
        }
        println()

        // 배열 반복
        val numbers = arrayOf(1, 2, 3)

        for (i in numbers) {
            println(i)
        }
    }

    @Test
    fun whileTest() {
        var x = 5

        // 자바와 동일
        while (x > 0) {
            println(x)
            x--
        }
    }
}
