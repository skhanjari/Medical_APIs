package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Medicament;
import com.example.rahmaproject.domain.repository.MedicamentRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetListMedicamentsUseCase {
    private final MedicamentRepository repository;

    public GetListMedicamentsUseCase(MedicamentRepository repository) {
        this.repository = repository;
    }

    public List<Medicament> execute() {
        return repository.findAll();
    }
}

