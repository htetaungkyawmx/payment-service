package org.cafe.paymentservice.service.impl;

import org.cafe.commons.entity.PaymentEntity;
import org.cafe.commons.repo.PaymentRepo;
import org.cafe.redisservice.cache.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseServiceImpl implements DatabaseService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public Object fetchData(String key) {
        return null;
    }

    @Override
    public Object saveData(String key, Object value) {
        PaymentEntity paymentEntity = (PaymentEntity) value;
        PaymentEntity.builder()
        return paymentRepo.save(paymentEntity);
    }

    @Override
    public void deleteData(String key) {

    }
}
