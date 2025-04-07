package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Consultation;
import com.example.rahmaproject.domain.repository.ConsultationRepository;
import org.springframework.stereotype.Component;

@Component

public class CreateConsultationUseCase {
    private final ConsultationRepository consultationRepository;

    public CreateConsultationUseCase(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Consultation execute(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}

