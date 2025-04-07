package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.*;
import com.example.RahmaProject.domain.model.Consultation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ConsultationService {

    private final CreateConsultationUseCase createConsultationUseCase;
    private final GetAllConsultationsUseCase getAllConsultationsUseCase;
    private final GetConsultationUseCase getConsultationUseCase;
    private final UpdateConsultationUseCase updateConsultationUseCase;
    private final DeleteConsultationUseCase deleteConsultationUseCase;


    public ConsultationService(CreateConsultationUseCase createConsultationUseCase,
                               GetAllConsultationsUseCase getAllConsultationsUseCase,
                               GetConsultationUseCase getConsultationUseCase,
                               UpdateConsultationUseCase updateConsultationUseCase,
                               DeleteConsultationUseCase deleteConsultationUseCase) {
        this.createConsultationUseCase = createConsultationUseCase;
        this.getAllConsultationsUseCase = getAllConsultationsUseCase;
        this.getConsultationUseCase = getConsultationUseCase;
        this.updateConsultationUseCase = updateConsultationUseCase;
        this.deleteConsultationUseCase = deleteConsultationUseCase;


    }

    public Consultation saveConsultation(Consultation consultation) {
        return createConsultationUseCase.execute(consultation);
    }

    public List<Consultation> getAllConsultations() {

        return getAllConsultationsUseCase.execute();
    }

    public Optional<Consultation> getConsultationById(String id) {

        return getConsultationUseCase.execute(id);
    }
    // Implémenté par rahma-hech
    public Consultation updateConsultation(Consultation consultation) {
        return updateConsultationUseCase.execute(consultation);
    }
    // Implémenté par rahma-hech
    public void deleteConsultation(String id) {
        deleteConsultationUseCase.execute(id);
    }



}
