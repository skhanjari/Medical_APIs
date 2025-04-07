package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.MedicalTest;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface MedicalTestRepository {
    MedicalTest save(MedicalTest medicalTest);
    List<MedicalTest> findAll();
    Optional<MedicalTest> findById(String id);

    List<MedicalTest> findAllMedicalTests();

    Optional<MedicalTest> findMedicalTestById(String id);
}

