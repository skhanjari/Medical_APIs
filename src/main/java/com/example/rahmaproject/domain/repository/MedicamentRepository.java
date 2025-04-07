package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.Medicament;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface MedicamentRepository {
    Medicament save(Medicament medicament);
    List<Medicament> findAll();
    Optional<Medicament> findById(String id);

    List<Medicament> findAllMedicaments();

    Optional<Medicament> findMedicamentById(String id);
}

