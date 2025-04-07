package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.ServiceStaff;
import com.example.rahmaproject.infrastructure.persistence.entity.ServiceStaffEntity;

import static java.util.Objects.requireNonNull;

public class ServiceStaffMapper {
    public static ServiceStaff toDomain(ServiceStaffEntity entity) {
        requireNonNull(entity, "ServiceStaff entity should not be null!");
        return ServiceStaff.builder()
                .id(entity.getId())
                .serviceId(entity.getService().getId())
                .staffId(entity.getStaff().getId())
                .build();
    }

    public static ServiceStaffEntity toEntity(ServiceStaff model) {
        requireNonNull(model, "ServiceStaff model should not be null!");
        return ServiceStaffEntity.builder()
                .id(model.getId())
                .build();
    }
}

