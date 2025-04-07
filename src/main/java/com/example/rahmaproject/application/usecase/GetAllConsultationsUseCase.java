package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Consultation;
import com.example.rahmaproject.domain.repository.ConsultationRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetAllConsultationsUseCase {
    private final ConsultationRepository consultationRepository;

    public GetAllConsultationsUseCase(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public List<Consultation> execute() {
        return consultationRepository.findAll();
    }
}

