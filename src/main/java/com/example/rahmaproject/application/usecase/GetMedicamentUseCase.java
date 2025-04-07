package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Medicament;
import com.example.rahmaproject.domain.repository.MedicamentRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetMedicamentUseCase {
    private final MedicamentRepository repository;

    public GetMedicamentUseCase(MedicamentRepository repository) {
        this.repository = repository;
    }

    public Optional<Medicament> execute(String id) {
        return repository.findById(id);
    }
}
