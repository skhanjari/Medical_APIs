package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.OrdonnanceDetail;
import com.example.rahmaproject.domain.repository.OrdonnanceDetailRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetListOrdonnanceDetailsUseCase {
    private final OrdonnanceDetailRepository repository;

    public GetListOrdonnanceDetailsUseCase(OrdonnanceDetailRepository repository) {
        this.repository = repository;
    }

    public List<OrdonnanceDetail> execute() {
        return repository.findAll();
    }
}

