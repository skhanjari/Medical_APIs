package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListMedicalTestsUseCase;
import com.example.rahmaproject.application.usecase.GetMedicalTestUseCase;
import com.example.rahmaproject.application.usecase.SaveMedicalTestUseCase;
import com.example.rahmaproject.domain.model.MedicalTest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class MedicalTestService {
    private final SaveMedicalTestUseCase saveMedicalTestUseCase;
    private final GetListMedicalTestsUseCase getListMedicalTestsUseCase;
    private final GetMedicalTestUseCase getMedicalTestUseCase;

    public MedicalTestService(SaveMedicalTestUseCase saveMedicalTestUseCase, GetListMedicalTestsUseCase getListMedicalTestsUseCase, GetMedicalTestUseCase getMedicalTestUseCase) {
        this.saveMedicalTestUseCase = saveMedicalTestUseCase;
        this.getListMedicalTestsUseCase = getListMedicalTestsUseCase;
        this.getMedicalTestUseCase = getMedicalTestUseCase;
    }

    public MedicalTest saveMedicalTest(MedicalTest medicalTest) {
        return saveMedicalTestUseCase.execute(medicalTest);
    }

    public List<MedicalTest> getListMedicalTests() {
        return getListMedicalTestsUseCase.execute();
    }

    public Optional<MedicalTest> getMedicalTestById(String id) {
        return getMedicalTestUseCase.execute(id);
    }
}

