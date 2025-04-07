package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.OrdonnanceDetailService;
import com.example.rahmaproject.domain.model.OrdonnanceDetail;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/ordonnancedetails")
@CrossOrigin
public class OrdonnanceDetailController {
    private final OrdonnanceDetailService ordonnanceDetailService;

    public OrdonnanceDetailController(OrdonnanceDetailService ordonnanceDetailService) {
        this.ordonnanceDetailService = ordonnanceDetailService;
    }

    @PostMapping("/add")
    public OrdonnanceDetail saveOrdonnanceDetail(@RequestBody OrdonnanceDetail ordonnanceDetail) {
        return ordonnanceDetailService.saveOrdonnanceDetail(ordonnanceDetail);
    }

    @GetMapping
    public List<OrdonnanceDetail> getListOrdonnanceDetails() {
        return ordonnanceDetailService.getListOrdonnanceDetails();
    }

    @GetMapping("/{id}")
    public Optional<OrdonnanceDetail> getOrdonnanceDetail(@PathVariable String id) {
        return ordonnanceDetailService.getOrdonnanceDetailById(id);
    }
}
