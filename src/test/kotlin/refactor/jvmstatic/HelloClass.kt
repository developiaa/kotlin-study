package refactor.jvmstatic

class HelloClass {
    companion object{
        @JvmStatic // 이렇게 하면 자바에서 Companion이나 INSTANCE 키워드 없이 호출 가능
        fun hello() = "Hello"
    }
}

object HiObject{
    @JvmStatic
    fun hi() = "hi"
}


fun main() {
    val hello = HelloClass.hello()
    println(hello)
    val hi = HiObject.hi()
    println(hi)

}
