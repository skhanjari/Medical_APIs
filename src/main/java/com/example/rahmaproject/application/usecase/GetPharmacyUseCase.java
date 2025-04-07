package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Pharmacy;
import com.example.rahmaproject.domain.repository.PharmacyRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetPharmacyUseCase {
    private final PharmacyRepository repository;

    public GetPharmacyUseCase(PharmacyRepository repository) {
        this.repository = repository;
    }

    public Optional<Pharmacy> execute(String id) {
        return repository.findById(id);
    }
}

