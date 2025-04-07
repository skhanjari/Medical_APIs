package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.Medicament;
import com.example.rahmaproject.infrastructure.persistence.entity.MedicamentEntity;

import static java.util.Objects.requireNonNull;

public class MedicamentMapper {
    public static Medicament toDomain(MedicamentEntity entity) {
        requireNonNull(entity, "Medicament entity should not be null!");
        return Medicament.builder()
                .id(entity.getId())
                .name(entity.getName())
                .type(null)
                .pharmacyId(null)
                .build();
    }

    public static MedicamentEntity toEntity(Medicament model) {
        requireNonNull(model, "Medicament model should not be null!");

        return MedicamentEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .description(null)
                .price(null)
                .build();
    }
}


