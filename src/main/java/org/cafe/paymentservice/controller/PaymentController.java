package org.cafe.paymentservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.cafe.paymentservice.domain.PaymentRequest;
import org.cafe.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create-payment")
    public ResponseEntity<String> createPayment(@RequestBody PaymentRequest paymentRequest, BindingResult result) {
        log.info("Payment request: {}", paymentRequest);
        paymentService.save(paymentRequest);
        return ResponseEntity.ok("Successfully created payment");
    }
}
