package basic

import org.junit.jupiter.api.Test

class 변수 {
    @Test
    fun `var은 값이 변경이 가능`(){
        var x : Int = 13
        println(x)
        x = 12
        println(x)
    }

    @Test
    fun `val은 값이 변경이 불가능`(){
        val x : Int = 13
        println(x)
        //컴파일 에러
        // x = 12
    }
}
