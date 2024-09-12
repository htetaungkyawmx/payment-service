package org.cafe.paymentservice.service.impl;

import org.cafe.commons.repo.PaymentRepo;
import org.cafe.paymentservice.domain.PaymentRequest;
import org.cafe.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired //1 bean discovery 2 bean wiring
    private PaymentRepo paymentRepo;
    @Override
    public void save(PaymentRequest paymentRequest) {

    }

}
