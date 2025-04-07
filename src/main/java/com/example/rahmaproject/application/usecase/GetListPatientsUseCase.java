package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Patient;
import com.example.rahmaproject.domain.repository.PatientRepository;

import java.util.List;

public class GetListPatientsUseCase {
    private final PatientRepository patientRepository;

    public GetListPatientsUseCase(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> execute(){
        return patientRepository.findAllPatients();
    }
}
