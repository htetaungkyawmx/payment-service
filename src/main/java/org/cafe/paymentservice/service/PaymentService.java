package org.cafe.paymentservice.service;

import org.cafe.paymentservice.domain.PaymentRequest;

public interface PaymentService {
    void save(PaymentRequest paymentRequest);
}
