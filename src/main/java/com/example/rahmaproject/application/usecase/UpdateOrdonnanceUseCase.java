package com.example.rahmaproject.application.usecase;


import com.example.rahmaproject.domain.model.Ordonnance;
import com.example.rahmaproject.domain.repository.OrdonnanceRepository;
import org.springframework.stereotype.Component;

@Component

public class UpdateOrdonnanceUseCase {
    private final OrdonnanceRepository ordonnanceRepository;

    public UpdateOrdonnanceUseCase(OrdonnanceRepository ordonnanceRepository) {
        this.ordonnanceRepository = ordonnanceRepository;
    }

    public Ordonnance execute(Ordonnance ordonnance) {
        return ordonnanceRepository.update(ordonnance);
    }
}
