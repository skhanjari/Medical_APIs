package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.ServiceStaff;
import com.example.rahmaproject.domain.repository.ServiceStaffRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetServiceStaffUseCase {
    private final ServiceStaffRepository repository;

    public GetServiceStaffUseCase(ServiceStaffRepository repository) {
        this.repository = repository;
    }

    public Optional<ServiceStaff> execute(String id) {
        return repository.findById(id);
    }
}

