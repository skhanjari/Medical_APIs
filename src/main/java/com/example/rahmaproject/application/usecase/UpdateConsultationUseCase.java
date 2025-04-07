package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Consultation;
import com.example.rahmaproject.domain.repository.ConsultationRepository;
import org.springframework.stereotype.Component;

@Component

public class UpdateConsultationUseCase {
    private final ConsultationRepository consultationRepository;

    public UpdateConsultationUseCase(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Consultation execute(Consultation consultation) {
        return consultationRepository.update(consultation);
    }
}
