package refactor.jvmstatic

class JvmFieldClass {
    companion object{
        @JvmField
        val id = 1234

        const val CODE = 1234
    }
}

object JvmFieldObject {
    @JvmField
    val name = "tom"

    const val FAMILY_NAME = "hoho"
}

fun main() {
    val id = JvmFieldClass.id
    println(id)
    val name = JvmFieldObject.name
    println(name)
}
