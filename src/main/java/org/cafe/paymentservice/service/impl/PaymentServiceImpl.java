package org.cafe.paymentservice.service.impl;

import org.cafe.paymentservice.domain.PaymentRequest;
import org.cafe.paymentservice.service.PaymentService;
import org.cafe.redisservice.cache.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private CacheService cacheService;

    @Override
    public void save(PaymentRequest paymentRequest) {
        String KEY_PREFIX = "payment:";
        cacheService.write(KEY_PREFIX+paymentRequest.getOrderId(), paymentRequest, 2, TimeUnit.MINUTES);
    }
}
