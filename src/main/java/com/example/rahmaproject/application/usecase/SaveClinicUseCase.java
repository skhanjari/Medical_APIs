package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Clinic;
import com.example.rahmaproject.domain.repository.ClinicRepository;
import org.springframework.stereotype.Component;

@Component


public class SaveClinicUseCase {
    private final ClinicRepository repository;

    public SaveClinicUseCase(ClinicRepository repository) {
        this.repository = repository;
    }

    public Clinic execute(Clinic clinic) {
        return repository.save(clinic);
    }
}

