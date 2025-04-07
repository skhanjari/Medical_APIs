package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Medicament;
import com.example.rahmaproject.domain.repository.MedicamentRepository;
import org.springframework.stereotype.Component;

@Component

public class SaveMedicamentUseCase {
    private final MedicamentRepository repository;

    public SaveMedicamentUseCase(MedicamentRepository repository) {
        this.repository = repository;
    }

    public Medicament execute(Medicament medicament) {
        return repository.save(medicament);
    }
}

