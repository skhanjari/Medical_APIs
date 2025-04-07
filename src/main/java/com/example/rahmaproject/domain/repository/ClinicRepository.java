package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.Clinic;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface ClinicRepository {
    Clinic save(Clinic clinic);
    List<Clinic> findAll();
    Optional<Clinic> findById(String id);

    List<Clinic> findAllClinics();

    Optional<Clinic> findClinicById(String id);
}
