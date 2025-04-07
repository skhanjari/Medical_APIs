package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.repository.OrdonnanceRepository;
import org.springframework.stereotype.Component;

@Component


public class DeleteOrdonnanceUseCase {
    private final OrdonnanceRepository ordonnanceRepository;

    public DeleteOrdonnanceUseCase(OrdonnanceRepository ordonnanceRepository) {
        this.ordonnanceRepository = ordonnanceRepository;
    }

    public void execute(String id) {
        ordonnanceRepository.deleteById(id);
    }


}
