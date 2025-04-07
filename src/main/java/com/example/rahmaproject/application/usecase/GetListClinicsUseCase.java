package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Clinic;
import com.example.rahmaproject.domain.repository.ClinicRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetListClinicsUseCase {
    private final ClinicRepository repository;

    public GetListClinicsUseCase(ClinicRepository repository) {
        this.repository = repository;
    }

    public List<Clinic> execute() {
        return repository.findAll();
    }
}

