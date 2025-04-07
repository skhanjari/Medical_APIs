package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListPatientsUseCase;
import com.example.rahmaproject.application.usecase.GetPatientUseCase;
import com.example.rahmaproject.application.usecase.SavePatientUseCase;
import com.example.rahmaproject.domain.model.Patient;

import java.util.List;
import java.util.Optional;


    public class
    PatientService {
        private final SavePatientUseCase savePatientUseCase;
        private final GetListPatientsUseCase getListPatientsUseCase;
        private final GetPatientUseCase getPatientUseCase;

        public PatientService(SavePatientUseCase savePatientUseCase, GetListPatientsUseCase getListPatientsUseCase, GetPatientUseCase getPatientUseCase) {
        this.savePatientUseCase = savePatientUseCase;
        this.getListPatientsUseCase = getListPatientsUseCase;
        this.getPatientUseCase = getPatientUseCase;
    }

    public Patient savePatient(Patient patient){
        return savePatientUseCase.execute(patient);
    }

    public List<Patient> getListPatients(){
        return getListPatientsUseCase.execute();
    }

    public Optional<Patient> getPatientById(String id){
        return getPatientUseCase.execute(id);
    }
}
