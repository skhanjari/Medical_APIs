package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.ServiceStaff;
import com.example.rahmaproject.domain.repository.ServiceStaffRepository;
import org.springframework.stereotype.Component;

@Component

public class SaveServiceStaffUseCase {
    private final ServiceStaffRepository repository;

    public SaveServiceStaffUseCase(ServiceStaffRepository repository) {
        this.repository = repository;
    }

    public ServiceStaff execute(ServiceStaff serviceStaff) {
        return repository.save(serviceStaff);
    }
}

