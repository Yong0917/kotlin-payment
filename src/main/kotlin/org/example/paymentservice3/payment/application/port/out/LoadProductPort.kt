package org.example.paymentservice3.payment.application.port.out

import org.example.paymentservice3.payment.domain.Product
import reactor.core.publisher.Flux

interface LoadProductPort {
    fun getProducts(cartId: Long, productIds: List<Long>, test1: Flux<Product>)
}