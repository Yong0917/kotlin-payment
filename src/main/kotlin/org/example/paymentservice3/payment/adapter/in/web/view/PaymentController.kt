package org.example.paymentservice3.payment.adapter.`in`.web.view

import org.example.paymentservice3.common.WebAdapter
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono


@Controller
@WebAdapter
class PaymentController {

    @GetMapping("/success")
    fun successPage(): Mono<String>{
        return Mono.just("success")
    }

    @GetMapping("/fail")
    fun failPage(): Mono<String>{
        return Mono.just("fail")
    }
}