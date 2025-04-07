package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.PharmacyStockService;
import com.example.rahmaproject.domain.model.PharmacyStock;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/pharmacy-stocks")
@CrossOrigin
public class PharmacyStockController {
    private final PharmacyStockService pharmacyStockService;

    public PharmacyStockController(PharmacyStockService pharmacyStockService) {
        this.pharmacyStockService = pharmacyStockService;
    }

    @PostMapping("/add")
    public PharmacyStock savePharmacyStock(@RequestBody PharmacyStock pharmacyStock) {
        return pharmacyStockService.savePharmacyStock(pharmacyStock);
    }

    @GetMapping
    public List<PharmacyStock> getListPharmacyStocks() {
        return pharmacyStockService.getListPharmacyStocks();
    }

    @GetMapping("/{id}")
    public Optional<PharmacyStock> getPharmacyStock(@PathVariable String id) {
        return pharmacyStockService.getPharmacyStockById(id);
    }
}
