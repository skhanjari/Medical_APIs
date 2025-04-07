package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Patient;
import com.example.rahmaproject.domain.repository.PatientRepository;

import java.util.Optional;

public class GetPatientUseCase {
    private final PatientRepository patientRepository;

    public GetPatientUseCase(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Optional<Patient> execute(String id){
        return patientRepository.findPatientById(id);
    }
}
