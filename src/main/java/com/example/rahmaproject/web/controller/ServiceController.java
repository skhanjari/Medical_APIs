package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.ServiceService;
import com.example.rahmaproject.domain.model.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/services")
@CrossOrigin
public class ServiceController {
    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping("/add")
    public Service saveService(@RequestBody Service service) {
        return serviceService.saveService(service);
    }

    @GetMapping
    public List<Service> getListServices() {
        return serviceService.getListServices();
    }

    @GetMapping("/{id}")
    public Optional<Service> getService(@PathVariable String id) {
        return serviceService.getServiceById(id);
    }
}
