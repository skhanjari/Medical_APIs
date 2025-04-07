package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.OrdonnanceDetail;
import com.example.rahmaproject.infrastructure.persistence.entity.OrdonnanceDetailEntity;

import static java.util.Objects.requireNonNull;

public class OrdonnanceDetailMapper {
    public static OrdonnanceDetail toDomain(OrdonnanceDetailEntity entity) {
        requireNonNull(entity, "OrdonnanceDetail entity should not be null!");
        return OrdonnanceDetail.builder()
                .id(entity.getId())
                .ordonnanceId(entity.getOrdonnance().getId())
                .medicamentId(entity.getMedicament().getId())
                .quantity(entity.getQuantity())
                .dosage(entity.getDosage())
                .build();
    }

    public static OrdonnanceDetailEntity toEntity(OrdonnanceDetail model) {
        requireNonNull(model, "OrdonnanceDetail model should not be null!");
        return OrdonnanceDetailEntity.builder()
                .id(model.getId())
                .quantity(model.getQuantity())
                .dosage(model.getDosage())
                .build();
    }
}

