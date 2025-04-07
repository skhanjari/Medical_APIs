package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Pharmacy;
import com.example.rahmaproject.domain.repository.PharmacyRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetListPharmaciesUseCase {
    private final PharmacyRepository repository;

    public GetListPharmaciesUseCase(PharmacyRepository repository) {
        this.repository = repository;
    }

    public List<Pharmacy> execute() {
        return repository.findAll();
    }
}

