package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.ServiceStaff;
import com.example.rahmaproject.domain.repository.ServiceStaffRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetListServiceStaffsUseCase {
    private final ServiceStaffRepository repository;

    public GetListServiceStaffsUseCase(ServiceStaffRepository repository) {
        this.repository = repository;
    }

    public List<ServiceStaff> execute() {
        return repository.findAll();
    }
}

