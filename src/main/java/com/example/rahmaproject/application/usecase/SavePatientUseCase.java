package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Patient;
import com.example.rahmaproject.domain.repository.PatientRepository;

public class SavePatientUseCase {
    private final PatientRepository patientRepository;

    public SavePatientUseCase(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient execute(Patient patient){
        return patientRepository.save(patient);
    }
}
