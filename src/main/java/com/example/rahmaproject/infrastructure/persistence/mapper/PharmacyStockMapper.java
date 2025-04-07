package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.PharmacyStock;
import com.example.rahmaproject.infrastructure.persistence.entity.PharmacyStockEntity;

import static java.util.Objects.requireNonNull;

public class PharmacyStockMapper {
    public static PharmacyStock toDomain(PharmacyStockEntity entity) {
        requireNonNull(entity, "PharmacyStock entity should not be null!");
        return PharmacyStock.builder()
                .id(entity.getId())
                .pharmacyId(entity.getPharmacy().getId())
                .medicamentId(entity.getMedicament().getId())
                .quantity(entity.getQuantity())
                .build();
    }

    public static PharmacyStockEntity toEntity(PharmacyStock model) {
        requireNonNull(model, "PharmacyStock model should not be null!");
        return PharmacyStockEntity.builder()
                .id(model.getId())
                .quantity(model.getQuantity())
                .build();
    }
}

