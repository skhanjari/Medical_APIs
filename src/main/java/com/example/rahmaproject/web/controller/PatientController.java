package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.PatientService;
import com.example.rahmaproject.domain.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/patients")
@CrossOrigin
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/add")
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping
    public List<Patient> getListPatients() {
        return patientService.getListPatients();
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatient(@PathVariable String id) {
        return patientService.getPatientById(id);
    }
}

