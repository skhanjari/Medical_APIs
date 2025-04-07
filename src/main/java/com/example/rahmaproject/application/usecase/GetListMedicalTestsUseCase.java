package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.MedicalTest;
import com.example.rahmaproject.domain.repository.MedicalTestRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetListMedicalTestsUseCase {
    private final MedicalTestRepository repository;

    public GetListMedicalTestsUseCase(MedicalTestRepository repository) {
        this.repository = repository;
    }

    public List<MedicalTest> execute() {
        return repository.findAll();
    }
}
