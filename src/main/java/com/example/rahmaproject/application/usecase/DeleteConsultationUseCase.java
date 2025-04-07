package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.repository.ConsultationRepository;
import org.springframework.stereotype.Component;

@Component


public class DeleteConsultationUseCase {
    private final ConsultationRepository consultationRepository;

    public DeleteConsultationUseCase(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public void execute(String id) {
        consultationRepository.deleteById(id);
    }
}
