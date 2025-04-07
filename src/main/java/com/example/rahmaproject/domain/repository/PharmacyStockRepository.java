package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.PharmacyStock;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface PharmacyStockRepository {
    PharmacyStock save(PharmacyStock pharmacyStock);
    List<PharmacyStock> findAll();
    Optional<PharmacyStock> findById(String id);

    List<PharmacyStock> findAllPharmacyStock();

    Optional<PharmacyStock> findPharmacyStockById(String id);
}
