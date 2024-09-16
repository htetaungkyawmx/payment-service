package org.cafe.paymentservice.service.impl;

import org.cafe.commons.entity.OrderEntity;
import org.cafe.commons.entity.PaymentEntity;
import org.cafe.commons.repo.OrderRepo;
import org.cafe.commons.repo.PaymentRepo;
import org.cafe.paymentservice.domain.PaymentRequest;
import org.cafe.redisservice.cache.DatabaseService;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DatabaseServiceImpl implements DatabaseService {

    @Autowired
    private PaymentRepo paymentRepo;
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Object fetchData(String key) {
        return null;
    }

    @Override
    public Object saveData(String key, Object value) {
        PaymentRequest paymentRequest = (PaymentRequest) value;
        OrderEntity orderEntity = orderRepo.findById(paymentRequest.getOrderId()).get();
        PaymentEntity paymentEntity = PaymentEntity.builder()
                .status(paymentRequest.getStatus())
                .amount(paymentRequest.getAmount())
                .processedAt(LocalDateTime.now())
                .order(orderEntity)
                .build();
        return paymentRepo.save(paymentEntity);
    }

    @Override
    public void deleteData(String key) {

    }
}
