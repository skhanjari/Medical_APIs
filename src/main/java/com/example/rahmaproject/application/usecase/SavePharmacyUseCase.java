package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Pharmacy;
import com.example.rahmaproject.domain.repository.PharmacyRepository;
import org.springframework.stereotype.Component;

@Component
public class SavePharmacyUseCase {
    private final PharmacyRepository repository;

    public SavePharmacyUseCase(PharmacyRepository repository) {
        this.repository = repository;
    }

    public Pharmacy execute(Pharmacy pharmacy) {
        return repository.save(pharmacy);
    }
}


