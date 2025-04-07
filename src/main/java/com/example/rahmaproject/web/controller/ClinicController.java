package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.ClinicService;
import com.example.rahmaproject.domain.model.Clinic;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/clinics")
@CrossOrigin
public class ClinicController {
    private final ClinicService clinicService;

    public ClinicController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @PostMapping("/add")
    public Clinic saveClinic(@RequestBody Clinic clinic) {
        return clinicService.saveClinic(clinic);
    }

    @GetMapping
    public List<Clinic> getListClinics() {
        return clinicService.getListClinics();
    }

    @GetMapping("/{id}")
    public Optional<Clinic> getClinic(@PathVariable String id) {
        return clinicService.getClinicById(id);
    }
}
