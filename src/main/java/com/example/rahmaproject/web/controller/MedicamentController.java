package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.MedicamentService;
import com.example.rahmaproject.domain.model.Medicament;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/medicaments")
@CrossOrigin
public class MedicamentController {
    private final MedicamentService medicamentService;

    public MedicamentController(MedicamentService medicamentService) {
        this.medicamentService = medicamentService;
    }

    @PostMapping("/add")
    public Medicament saveMedicament(@RequestBody Medicament medicament) {
        return medicamentService.saveMedicament(medicament);
    }

    @GetMapping
    public List<Medicament> getListMedicaments() {
        return medicamentService.getListMedicaments();
    }

    @GetMapping("/{id}")
    public Optional<Medicament> getMedicament(@PathVariable String id) {
        return medicamentService.getMedicamentById(id);
    }
}

