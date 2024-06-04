package org.example.paymentservice3.payment.adapter.`in`.web.request

import java.time.LocalDateTime

data class CheckoutRequest(
    var cartId: Long = 1,
    val productIds: List<Long> = listOf(1, 2, 3),
    val buyerId: Long = 1,
    val seed: String = LocalDateTime.now().toString()
)
