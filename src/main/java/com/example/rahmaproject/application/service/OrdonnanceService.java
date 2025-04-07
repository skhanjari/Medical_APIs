package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.*;
import com.example.rahmaproject.domain.model.Ordonnance;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdonnanceService {
    private final CreateOrdonnanceUseCase createOrdonnanceUseCase;
    private final GetListOrdonnancesUseCase getListOrdonnancesUseCase;
    private final GetOrdonnanceUseCase getOrdonnanceUseCase;
    private final UpdateOrdonnanceUseCase updateOrdonnanceUseCase;
    private final DeleteOrdonnanceUseCase deleteOrdonnanceUseCase;

    public OrdonnanceService(CreateOrdonnanceUseCase createOrdonnanceUseCase,
                             GetListOrdonnancesUseCase getListOrdonnancesUseCase,
                             GetOrdonnanceUseCase getOrdonnanceUseCase,
                             UpdateOrdonnanceUseCase updateOrdonnanceUseCase,
                             DeleteOrdonnanceUseCase deleteOrdonnanceUseCase) {
        this.createOrdonnanceUseCase = createOrdonnanceUseCase;
        this.getListOrdonnancesUseCase = getListOrdonnancesUseCase;
        this.getOrdonnanceUseCase = getOrdonnanceUseCase;
        this.updateOrdonnanceUseCase = updateOrdonnanceUseCase;
        this.deleteOrdonnanceUseCase = deleteOrdonnanceUseCase;
    }

    public Ordonnance createOrdonnance(Ordonnance ordonnance) {
        return createOrdonnanceUseCase.execute(ordonnance);
    }

    public List<Ordonnance> getListOrdonnances() {
        return getListOrdonnancesUseCase.execute();
    }

    public Optional<Ordonnance> getOrdonnanceById(String id) {
        return getOrdonnanceUseCase.execute(id);

    }
    // Implémenté par rahma-hech
    public Ordonnance updateOrdonnance(Ordonnance ordonnance) {
        return updateOrdonnanceUseCase.execute(ordonnance);
    }
    // Implémenté par rahma-hech
    public void deleteOrdonnance(String id) {
        deleteOrdonnanceUseCase.execute(id);
    }
}

