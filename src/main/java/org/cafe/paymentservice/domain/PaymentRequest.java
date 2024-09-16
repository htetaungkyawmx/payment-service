package org.cafe.paymentservice.domain;

import lombok.*;
import org.cafe.commons.entity.PaymentEntity;
import org.cafe.commons.shared.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentRequest {
    private Status status;
    private BigDecimal amount;
    private UUID orderId;

    public PaymentEntity toEntity(PaymentRequest paymentRequest) {
        return PaymentEntity.builder()
                .status(paymentRequest.getStatus())
                .amount(paymentRequest.getAmount())
                .processedAt(LocalDateTime.now())
                .build();
    }
}
