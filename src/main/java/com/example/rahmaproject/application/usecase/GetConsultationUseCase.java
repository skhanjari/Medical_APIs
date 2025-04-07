package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Consultation;
import com.example.rahmaproject.domain.repository.ConsultationRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetConsultationUseCase {
    private final ConsultationRepository consultationRepository ;

    public GetConsultationUseCase(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Optional<Consultation> execute(String id) {
        return consultationRepository.findById(id);
    }
}

