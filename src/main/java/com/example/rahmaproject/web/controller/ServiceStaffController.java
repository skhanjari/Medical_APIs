package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.ServiceStaffService;
import com.example.rahmaproject.domain.model.ServiceStaff;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/service-staffs")
@CrossOrigin
public class ServiceStaffController {
    private final ServiceStaffService serviceStaffService;

    public ServiceStaffController(ServiceStaffService serviceStaffService) {
        this.serviceStaffService = serviceStaffService;
    }

    @PostMapping("/add")
    public ServiceStaff saveServiceStaff(@RequestBody ServiceStaff serviceStaff) {
        return serviceStaffService.saveServiceStaff(serviceStaff);
    }

    @GetMapping
    public List<ServiceStaff> getListServiceStaffs() {
        return serviceStaffService.getListServiceStaffs();
    }

    @GetMapping("/{id}")
    public Optional<ServiceStaff> getServiceStaff(@PathVariable String id) {
        return serviceStaffService.getServiceStaffById(id);
    }
}

