package com.devbp.ecommerce_api.domain.entities;

import com.devbp.ecommerce_api.domain.StatusType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "order_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderStatus {

    @Id
    @UuidGenerator
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusType status;

    @Column(name = "status_date")
    private LocalDateTime statusDate;

    private String notes;

    @PrePersist
    protected void onCreate() {
        statusDate = LocalDateTime.now();
    }
}
