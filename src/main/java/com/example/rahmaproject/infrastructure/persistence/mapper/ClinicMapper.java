package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.Clinic;
import com.example.rahmaproject.infrastructure.persistence.entity.ClinicEntity;

import static java.util.Objects.requireNonNull;

public class ClinicMapper {
    public static Clinic toDomain(ClinicEntity entity) {
        requireNonNull(entity, "Clinic entity should not be null!");
        return Clinic.builder()
                .id(entity.getId())
                .name(entity.getName())
                .address(entity.getAddress())
                .build();
    }

    public static ClinicEntity toEntity(Clinic model) {
        requireNonNull(model, "Clinic model should not be null!");
        return ClinicEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .address(model.getAddress())
                .build();
    }
}
