package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.PharmacyService;
import com.example.rahmaproject.domain.model.Pharmacy;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/pharmacies")
@CrossOrigin
public class PharmacyController {
    private final PharmacyService pharmacyService;

    public PharmacyController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @PostMapping("/add")
    public Pharmacy savePharmacy(@RequestBody Pharmacy pharmacy) {
        return pharmacyService.savePharmacy(pharmacy);
    }

    @GetMapping
    public List<Pharmacy> getListPharmacies() {
        return pharmacyService.getListPharmacies();
    }

    @GetMapping("/{id}")
    public Optional<Pharmacy> getPharmacy(@PathVariable String id) {
        return pharmacyService.getPharmacyById(id);
    }
}


