package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Service;
import com.example.rahmaproject.domain.repository.ServiceRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetServiceUseCase {
    private final ServiceRepository repository;

    public GetServiceUseCase(ServiceRepository repository) {
        this.repository = repository;
    }

    public Optional<Service> execute(String id) {
        return repository.findById(id);
    }
}

