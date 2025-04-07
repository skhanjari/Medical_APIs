package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.Patient;
import com.example.rahmaproject.infrastructure.persistence.entity.PatientEntity;

import static java.util.Objects.requireNonNull;

public class PatientMapper {
    public static Patient toDomain(PatientEntity patientEntity){
        requireNonNull(patientEntity, "patient entity should not be null!");
        return Patient.builder()
                .id(patientEntity.getId())
                .firstname(patientEntity.getFirstname())
                .lastname(patientEntity.getLastname())
                .birthdate(patientEntity.getBirthdate())
                .gender(patientEntity.getGender())
                .mobile(patientEntity.getMobile())
                .email(patientEntity.getEmail())
                .build();
    }

    public static PatientEntity toEntity(Patient patient){
        requireNonNull(patient, "patient model should not be null!");
        return PatientEntity.builder()
                .id(patient.getId())
                .firstname(patient.getFirstname())
                .lastname(patient.getLastname())
                .birthdate(patient.getBirthdate())
                .gender(patient.getGender())
                .mobile(patient.getMobile())
                .email(patient.getEmail())
                .build();
    }
}
