package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface PatientRepository {
    Patient save(Patient patient);
    List<Patient> findAllPatients();
    Optional<Patient> findPatientById(String id);

}
