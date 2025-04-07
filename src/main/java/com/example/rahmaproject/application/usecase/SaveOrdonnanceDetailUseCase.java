package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.OrdonnanceDetail;
import com.example.rahmaproject.domain.repository.OrdonnanceDetailRepository;
import org.springframework.stereotype.Component;

@Component

public class SaveOrdonnanceDetailUseCase {
    private final OrdonnanceDetailRepository repository;

    public SaveOrdonnanceDetailUseCase(OrdonnanceDetailRepository repository) {
        this.repository = repository;
    }

    public OrdonnanceDetail execute(OrdonnanceDetail ordonnanceDetail) {
        return repository.save(ordonnanceDetail);
    }
}
