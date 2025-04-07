package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.MedicalTest;
import com.example.rahmaproject.domain.repository.MedicalTestRepository;
import org.springframework.stereotype.Component;

@Component

public class SaveMedicalTestUseCase {
    private final MedicalTestRepository repository;

    public SaveMedicalTestUseCase(MedicalTestRepository repository) {
        this.repository = repository;
    }

    public MedicalTest execute(MedicalTest medicalTest) {
        return repository.save(medicalTest);
    }
}
