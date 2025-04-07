package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.PharmacyStock;
import com.example.rahmaproject.domain.repository.PharmacyStockRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetPharmacyStockUseCase {
    private final PharmacyStockRepository repository;

    public GetPharmacyStockUseCase(PharmacyStockRepository repository) {
        this.repository = repository;
    }

    public Optional<PharmacyStock> execute(String id) {
        return repository.findById(id);
    }
}

