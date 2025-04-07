package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.MedicalTest;
import com.example.rahmaproject.infrastructure.persistence.entity.MedicalTestEntity;

import static java.util.Objects.requireNonNull;

public class MedicalTestMapper {
    public static MedicalTest toDomain(MedicalTestEntity entity) {
        requireNonNull(entity, "MedicalTest entity should not be null!");
        return MedicalTest.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .build();
    }

    public static MedicalTestEntity toEntity(MedicalTest model) {
        requireNonNull(model, "MedicalTest model should not be null!");
        return MedicalTestEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .description(model.getDescription())
                .build();
    }
}

