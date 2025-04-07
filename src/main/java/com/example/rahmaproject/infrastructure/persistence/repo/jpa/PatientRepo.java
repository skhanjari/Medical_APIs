package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.infrastructure.persistence.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<PatientEntity, String> {

}
