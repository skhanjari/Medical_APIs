package com.example.rahmaproject.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ordonnance_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdonnanceDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "ordonnance_id", nullable = false)
    private OrdonnanceEntity ordonnance;

    @ManyToOne
    @JoinColumn(name = "medicament_id", nullable = false)
    private MedicamentEntity medicament;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private String dosage;
}

