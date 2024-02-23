import org.junit.jupiter.api.Test

class 클래스 {
    class Coffee(
        var name: String = "", // 기본값
        var price: Int = 0, // 후행 쉼표
        var iced: Boolean = false,
    ) {
        val brand: String
            get() = "스타벅스" // custom getter

        var quantity: Int = 0
            set(value) {    // custom setter
                if (value > 0) { // 수량이 0이상인 경우에만 할당
                    field =
                        value // field 식별자 = quantity와 같다. 다만 field를 quantity로 변경할 경우 재귀호출이 발생하여 stackOverflowError가 발생한다.
                }
            }

    }

    fun main() {
        val coffee = Coffee()
        coffee.name = "아이스 아메리카노"
        coffee.price = 2000
//        coffee.brand = "커피빈" // 불가
        coffee.quantity = 1
        coffee.iced = true

        println("${coffee.name} 가격은 ${coffee.price}원") // var인 경우 getter, setter 자동 생성, val인 경우 getter만 생성
        println("${coffee.brand}")
        println("${coffee.quantity}")
        println("${coffee.iced}")

        if (coffee.iced) { // 프로퍼티 문법
            println("아이스 커피")
        }

    }

    @Test
    fun test() {
        main()
    }
}

