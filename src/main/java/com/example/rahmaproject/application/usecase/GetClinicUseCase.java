package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Clinic;
import com.example.rahmaproject.domain.repository.ClinicRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetClinicUseCase {
    private final ClinicRepository repository;

    public GetClinicUseCase(ClinicRepository repository) {
        this.repository = repository;
    }

    public Optional<Clinic> execute(String id) {
        return repository.findById(id);
    }
}

