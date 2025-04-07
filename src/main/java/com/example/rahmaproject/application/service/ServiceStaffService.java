package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListServiceStaffsUseCase;
import com.example.rahmaproject.application.usecase.GetServiceStaffUseCase;
import com.example.rahmaproject.application.usecase.SaveServiceStaffUseCase;
import com.example.rahmaproject.domain.model.ServiceStaff;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class ServiceStaffService {
    private final SaveServiceStaffUseCase saveServiceStaffUseCase;
    private final GetListServiceStaffsUseCase getListServiceStaffsUseCase;
    private final GetServiceStaffUseCase getServiceStaffUseCase;

    public ServiceStaffService(SaveServiceStaffUseCase saveServiceStaffUseCase, GetListServiceStaffsUseCase getListServiceStaffsUseCase, GetServiceStaffUseCase getServiceStaffUseCase) {
        this.saveServiceStaffUseCase = saveServiceStaffUseCase;
        this.getListServiceStaffsUseCase = getListServiceStaffsUseCase;
        this.getServiceStaffUseCase = getServiceStaffUseCase;
    }

    public ServiceStaff saveServiceStaff(ServiceStaff serviceStaff) {
        return saveServiceStaffUseCase.execute(serviceStaff);
    }

    public List<ServiceStaff> getListServiceStaffs() {
        return getListServiceStaffsUseCase.execute();
    }

    public Optional<ServiceStaff> getServiceStaffById(String id) {
        return getServiceStaffUseCase.execute(id);
    }
}

