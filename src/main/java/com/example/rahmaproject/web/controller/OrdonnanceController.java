package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.OrdonnanceService;
import com.example.rahmaproject.domain.model.Ordonnance;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/ordonnances")
@CrossOrigin
public class OrdonnanceController {

    private final OrdonnanceService ordonnanceService;

    public OrdonnanceController(OrdonnanceService ordonnanceService) {
        this.ordonnanceService = ordonnanceService;
    }

    @PostMapping("/add")
    public Ordonnance createOrdonnance(@RequestBody Ordonnance ordonnance) {
        return ordonnanceService.createOrdonnance(ordonnance);
    }

    @GetMapping
    public List<Ordonnance> getListOrdonnances() {
        return ordonnanceService.getListOrdonnances();
    }

    @GetMapping("/{id}")
    public Optional<Ordonnance> getOrdonnance(@PathVariable String id) {
        return ordonnanceService.getOrdonnanceById(id);
    }
    @PutMapping("/update")
    public Ordonnance updateOrdonnance(@RequestBody Ordonnance ordonnance) {
        return ordonnanceService.updateOrdonnance(ordonnance);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrdonnance(@PathVariable String id) {
        ordonnanceService.deleteOrdonnance(id);
    }
}


