package org.cafe.paymentservice.service.impl;

import org.cafe.paymentservice.domain.PaymentRequest;
import org.cafe.paymentservice.service.PaymentService;
import org.cafe.redisservice.cache.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private RedisCacheService redisCacheService;

    @Override
    public void save(PaymentRequest paymentRequest) {
      redisCacheService.set(String.valueOf(paymentRequest.getOrderId()), paymentRequest);
    }
}
