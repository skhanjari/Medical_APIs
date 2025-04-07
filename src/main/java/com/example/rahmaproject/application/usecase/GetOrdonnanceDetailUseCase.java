package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.OrdonnanceDetail;
import com.example.rahmaproject.domain.repository.OrdonnanceDetailRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetOrdonnanceDetailUseCase {
    private final OrdonnanceDetailRepository repository;

    public GetOrdonnanceDetailUseCase(OrdonnanceDetailRepository repository) {
        this.repository = repository;
    }

    public Optional<OrdonnanceDetail> execute(String id) {
        return repository.findById(id);
    }
}

