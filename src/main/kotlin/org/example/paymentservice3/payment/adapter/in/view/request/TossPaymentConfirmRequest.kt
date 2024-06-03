package org.example.paymentservice3.payment.adapter.`in`.view.request

data class TossPaymentConfirmRequest (
    val paymentKey: String,
    val orderId: String,
    val amount: String
)