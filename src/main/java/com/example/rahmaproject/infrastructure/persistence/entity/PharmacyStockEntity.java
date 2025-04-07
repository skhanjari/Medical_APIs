package com.example.rahmaproject.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pharmacy_stock")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PharmacyStockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "pharmacy_id", nullable = false)
    private PharmacyEntity pharmacy;

    @ManyToOne
    @JoinColumn(name = "medicament_id", nullable = false)
    private MedicamentEntity medicament;

    @Column(nullable = false)
    private Integer quantity;
}

