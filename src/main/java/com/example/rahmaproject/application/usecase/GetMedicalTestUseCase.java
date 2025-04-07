package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.MedicalTest;
import com.example.rahmaproject.domain.repository.MedicalTestRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetMedicalTestUseCase {
    private final MedicalTestRepository repository;

    public GetMedicalTestUseCase(MedicalTestRepository repository) {
        this.repository = repository;
    }

    public Optional<MedicalTest> execute(String id) {
        return repository.findById(id);
    }
}

