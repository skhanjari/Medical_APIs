package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Service;
import com.example.rahmaproject.domain.repository.ServiceRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetListServicesUseCase {
    private final ServiceRepository repository;

    public GetListServicesUseCase(ServiceRepository repository) {
        this.repository = repository;
    }

    public List<Service> execute() {
        return repository.findAll();
    }
}
