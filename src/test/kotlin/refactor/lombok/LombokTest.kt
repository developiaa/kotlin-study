package refactor.lombok

class LombokTest {
}

fun main() {
    val hero = Hero()

    // 자바에 롬복을 코틀린에서 사용 불가
    // 1. 자바에서 롬복을 제거하고 IDE에서 제공해주는 방법으로 코드 생성
    // 2. 롬복을 사용하는 자바코드 자체를 코틀린으로 전환하는 방법 - 추천
    hero.name = "아이언맨"
    println(hero.name)

    hero.address = "abcd"
    println(hero.address)


    val hero2 = HeroKt(name="아이언맨", age=50, address = "TEXT")
    println(hero2.name)
    println(hero2.address)

}
