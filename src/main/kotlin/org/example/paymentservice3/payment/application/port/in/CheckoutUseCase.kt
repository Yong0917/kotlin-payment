package org.example.paymentservice3.payment.application.port.`in`

import org.example.paymentservice3.payment.domain.CheckoutResult
import reactor.core.publisher.Mono

interface CheckoutUseCase {

    fun checkout(command: CheckoutCommand): Mono<CheckoutResult>
}