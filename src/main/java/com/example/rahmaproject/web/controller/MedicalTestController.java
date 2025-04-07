package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.MedicalTestService;
import com.example.rahmaproject.domain.model.MedicalTest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/medical-tests")
@CrossOrigin
public class MedicalTestController {
    private final MedicalTestService medicalTestService;

    public MedicalTestController(MedicalTestService medicalTestService) {
        this.medicalTestService = medicalTestService;
    }

    @PostMapping("/add")
    public MedicalTest saveMedicalTest(@RequestBody MedicalTest medicalTest) {
        return medicalTestService.saveMedicalTest(medicalTest);
    }

    @GetMapping
    public List<MedicalTest> getListMedicalTests() {
        return medicalTestService.getListMedicalTests();
    }

    @GetMapping("/{id}")
    public Optional<MedicalTest> getMedicalTest(@PathVariable String id) {
        return medicalTestService.getMedicalTestById(id);
    }
}

