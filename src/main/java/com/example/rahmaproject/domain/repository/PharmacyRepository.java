package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.Pharmacy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface PharmacyRepository {
    Pharmacy save(Pharmacy pharmacy);
    List<Pharmacy> findAll();
    Optional<Pharmacy> findById(String id);

    List<Pharmacy> findAllPharmacies();

    Optional<Pharmacy> findPharmacyById(String id);
}

