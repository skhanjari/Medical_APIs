package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Service;
import com.example.rahmaproject.domain.repository.ServiceRepository;
import org.springframework.stereotype.Component;

@Component

public class SaveServiceUseCase {
    private final ServiceRepository repository;

    public SaveServiceUseCase(ServiceRepository repository) {
        this.repository = repository;
    }

    public Service execute(Service service) {
        return repository.save(service);
    }
}

