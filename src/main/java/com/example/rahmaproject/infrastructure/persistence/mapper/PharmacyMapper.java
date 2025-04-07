package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.Pharmacy;
import com.example.rahmaproject.infrastructure.persistence.entity.PharmacyEntity;

import static java.util.Objects.requireNonNull;

public class PharmacyMapper {
    public static Pharmacy toDomain(PharmacyEntity entity) {
        requireNonNull(entity, "Pharmacy entity should not be null!");
        return Pharmacy.builder()
                .id(entity.getId())
                .name(entity.getName())
                .location(entity.getLocation())
                .build();
    }

    public static PharmacyEntity toEntity(Pharmacy model) {
        requireNonNull(model, "Pharmacy model should not be null!");
        return PharmacyEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .location(model.getLocation())
                .build();
    }
}

