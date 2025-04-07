package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListClinicsUseCase;
import com.example.rahmaproject.application.usecase.GetClinicUseCase;
import com.example.rahmaproject.application.usecase.SaveClinicUseCase;
import com.example.rahmaproject.domain.model.Clinic;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class ClinicService {
    private final SaveClinicUseCase saveClinicUseCase;
    private final GetListClinicsUseCase getListClinicsUseCase;
    private final GetClinicUseCase getClinicUseCase;

    public ClinicService(SaveClinicUseCase saveClinicUseCase, GetListClinicsUseCase getListClinicsUseCase, GetClinicUseCase getClinicUseCase) {
        this.saveClinicUseCase = saveClinicUseCase;
        this.getListClinicsUseCase = getListClinicsUseCase;
        this.getClinicUseCase = getClinicUseCase;
    }

    public Clinic saveClinic(Clinic clinic) {
        return saveClinicUseCase.execute(clinic);
    }

    public List<Clinic> getListClinics() {
        return getListClinicsUseCase.execute();
    }

    public Optional<Clinic> getClinicById(String id) {
        return getClinicUseCase.execute(id);
    }
}
