package org.example.paymentservice3.payment.domain

data class CheckoutResult(
    val amount:Long,
    val orderId: String,
    val orderName: String
)
