package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListServicesUseCase;
import com.example.rahmaproject.application.usecase.GetServiceUseCase;
import com.example.rahmaproject.application.usecase.SaveServiceUseCase;
import com.example.rahmaproject.domain.model.Service;

import java.util.List;
import java.util.Optional;
@org.springframework.stereotype.Service

public class ServiceService {
    private final SaveServiceUseCase saveServiceUseCase;
    private final GetListServicesUseCase getListServicesUseCase;
    private final GetServiceUseCase getServiceUseCase;

    public ServiceService(SaveServiceUseCase saveServiceUseCase, GetListServicesUseCase getListServicesUseCase, GetServiceUseCase getServiceUseCase) {
        this.saveServiceUseCase = saveServiceUseCase;
        this.getListServicesUseCase = getListServicesUseCase;
        this.getServiceUseCase = getServiceUseCase;
    }

    public Service saveService(Service service) {
        return saveServiceUseCase.execute(service);
    }

    public List<Service> getListServices() {
        return getListServicesUseCase.execute();
    }

    public Optional<Service> getServiceById(String id) {
        return getServiceUseCase.execute(id);
    }
}

