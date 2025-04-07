package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Ordonnance;
import com.example.rahmaproject.domain.repository.OrdonnanceRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetListOrdonnancesUseCase {
    private final OrdonnanceRepository ordonnanceRepository;

    public GetListOrdonnancesUseCase(OrdonnanceRepository ordonnanceRepository) {
        this.ordonnanceRepository = ordonnanceRepository;
    }

    public List<Ordonnance> execute() {
        return ordonnanceRepository.findAllOrdonnances();
    }
}


