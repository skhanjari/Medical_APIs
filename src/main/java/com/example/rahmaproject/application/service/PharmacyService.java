package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListPharmaciesUseCase;
import com.example.rahmaproject.application.usecase.GetPharmacyUseCase;
import com.example.rahmaproject.application.usecase.SavePharmacyUseCase;
import com.example.rahmaproject.domain.model.Pharmacy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class PharmacyService {
    private final SavePharmacyUseCase savePharmacyUseCase;
    private final GetListPharmaciesUseCase getListPharmaciesUseCase;
    private final GetPharmacyUseCase getPharmacyUseCase;

    public PharmacyService(SavePharmacyUseCase savePharmacyUseCase, GetListPharmaciesUseCase getListPharmaciesUseCase, GetPharmacyUseCase getPharmacyUseCase) {
        this.savePharmacyUseCase = savePharmacyUseCase;
        this.getListPharmaciesUseCase = getListPharmaciesUseCase;
        this.getPharmacyUseCase = getPharmacyUseCase;
    }

    public Pharmacy savePharmacy(Pharmacy pharmacy) {
        return savePharmacyUseCase.execute(pharmacy);
    }

    public List<Pharmacy> getListPharmacies() {
        return getListPharmaciesUseCase.execute();
    }

    public Optional<Pharmacy> getPharmacyById(String id) {
        return getPharmacyUseCase.execute(id);
    }
}
