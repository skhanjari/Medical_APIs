package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.Staff;
import com.example.rahmaproject.infrastructure.persistence.entity.StaffEntity;

import static java.util.Objects.requireNonNull;

public class StaffMapper {
    public static Staff toDomain(StaffEntity entity) {
        requireNonNull(entity, "Staff entity should not be null!");
        return Staff.builder()
                .id(entity.getId())
                .name(entity.getFirstname() + " " + entity.getLastname())
                .role(entity.getRole())
                .clinicId(null)
                .build();
    }

    public static StaffEntity toEntity(Staff model) {
        requireNonNull(model, "Staff model should not be null!");


        String[] nameParts = model.getName().split(" ", 2);
        String firstname = nameParts.length > 0 ? nameParts[0] : "";
        String lastname = nameParts.length > 1 ? nameParts[1] : "";

        return StaffEntity.builder()
                .id(model.getId())
                .firstname(firstname)
                .lastname(lastname)
                .role(model.getRole())
                .email(null)
                .phone(null)
                .build();
    }
}
