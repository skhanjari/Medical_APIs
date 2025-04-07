package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.PharmacyStock;
import com.example.rahmaproject.domain.repository.PharmacyStockRepository;
import org.springframework.stereotype.Component;

@Component

public class SavePharmacyStockUseCase {
    private final PharmacyStockRepository repository;

    public SavePharmacyStockUseCase(PharmacyStockRepository repository) {
        this.repository = repository;
    }

    public PharmacyStock execute(PharmacyStock pharmacyStock) {
        return repository.save(pharmacyStock);
    }
}

