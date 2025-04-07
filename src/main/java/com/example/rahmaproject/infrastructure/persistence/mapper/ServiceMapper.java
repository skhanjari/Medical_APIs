package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.Service;
import com.example.rahmaproject.infrastructure.persistence.entity.ServiceEntity;

import static java.util.Objects.requireNonNull;

public class ServiceMapper {
    public static Service toDomain(ServiceEntity entity) {
        requireNonNull(entity, "Service entity should not be null!");
        return Service.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    public static ServiceEntity toEntity(Service model) {
        requireNonNull(model, "Service model should not be null!");
        return ServiceEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .build();
    }
}

