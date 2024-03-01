package basic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class 열거형 {

    enum class PaymentStatus(val label: String) : Payable {
        UNPAID("미지급") {
            override fun isPayable(): Boolean = true
        },
        PAID("지급완료") {
            override fun isPayable(): Boolean = false
        },
        FAILED("지급실패") {
            override fun isPayable(): Boolean = false
        },
        REFUNDED("환불") {
            override fun isPayable(): kotlin.Boolean = false
        };

//        abstract fun isPayable(): Boolean
    }

    interface Payable {
        fun isPayable(): Boolean
    }

    @Test
    fun main() {
        println(PaymentStatus.UNPAID.label)

        assertTrue { PaymentStatus.UNPAID.isPayable() }
        assertFalse { PaymentStatus.PAID.isPayable() }
        assertFalse { PaymentStatus.FAILED.isPayable() }
        assertFalse { PaymentStatus.REFUNDED.isPayable() }

        val paymentStatus = PaymentStatus.valueOf("PAID")

        if (paymentStatus == PaymentStatus.PAID) {
            println("결제 완료 상태")
        }
        assertEquals(PaymentStatus.PAID, paymentStatus)

        for (status in PaymentStatus.values()) {
            println("[${status}], ${status.name}, ${status.ordinal} : (${status.label})")
        }
    }
}
