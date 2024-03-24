package advanced

import org.junit.jupiter.api.Test

class 실드클래스 {
    @Test
    fun test() {
        val backendDeveloper = BackendDeveloper(name = "K")
        DeveloperPool.add(backendDeveloper)

        val frontendDeveloper = FrontendDeveloper(name = "A")
        DeveloperPool.add(frontendDeveloper)

        val androidDeveloper = AndroidDeveloper(name = "D")
        DeveloperPool.add(androidDeveloper)

        println(DeveloperPool.get("K"))
        println(DeveloperPool.get("A"))
        println(DeveloperPool.get("D"))

    }
}


sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("백엔드 개발자이며 언어는 ${language}를 사용합니다.")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("프론트 개발자이며 언어는 ${language}를 사용합니다.")
    }
}

object OtherDeveloper : Developer() {
    override val name: String = "익명"
    override fun code(language: String) {
    }
}

data class AndroidDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("안드로이드 개발자이며 언어는 ${language}를 사용합니다.")
    }
}


object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()
    fun add(developer: Developer) = when (developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자 종류입니다.")
        is AndroidDeveloper -> pool[developer.name] = developer
//        else -> println("지원하지 않는 개발자 종류입니다.")

        // sealed class로 바꾸면 compile 에러나지 않음
//        else -> {
//            println("지원하지 않는 개발자입니다.")
//        }
    }

    fun get(name: String) = pool[name]
}
