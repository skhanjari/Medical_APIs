package com.example.rahmaproject.infrastructure.persistence.mapper;

import com.example.rahmaproject.domain.model.Consultation;
import com.example.rahmaproject.infrastructure.persistence.entity.ConsultationEntity;

public class  ConsultationMapper {
    public static Consultation toDomain(ConsultationEntity entity) {
        return Consultation.builder()
                .id(entity.getId())
                .patientId(entity.getPatientId())
                .doctorId(entity.getDoctorId())
                .date(entity.getDate())
                .notes(entity.getNotes())
                .build();
    }

    public static ConsultationEntity toEntity(Consultation consultation) {
        return ConsultationEntity.builder()
                .id(consultation.getId())
                .patientId(consultation.getPatientId())
                .doctorId(consultation.getDoctorId())
                .date(consultation.getDate())
                .notes(consultation.getNotes())
                .build();
    }
}
