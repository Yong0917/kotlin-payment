package org.example.paymentservice3.payment.application.service

import org.example.paymentservice3.common.UseCase
import org.example.paymentservice3.payment.application.port.`in`.CheckoutCommand
import org.example.paymentservice3.payment.application.port.`in`.CheckoutUseCase
import org.example.paymentservice3.payment.application.port.out.LoadProductPort
import org.example.paymentservice3.payment.domain.CheckoutResult
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
@UseCase
class CheckoutService(
    private val loadProductPort: LoadProductPort
): CheckoutUseCase {

    override fun checkout(command: CheckoutCommand): Mono<CheckoutResult> {
        TODO("Not yet implemented")
    }
}