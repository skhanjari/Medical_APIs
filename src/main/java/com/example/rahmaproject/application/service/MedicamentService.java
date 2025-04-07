package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListMedicamentsUseCase;
import com.example.rahmaproject.application.usecase.GetMedicamentUseCase;
import com.example.rahmaproject.application.usecase.SaveMedicamentUseCase;
import com.example.rahmaproject.domain.model.Medicament;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class MedicamentService {
    private final SaveMedicamentUseCase saveMedicamentUseCase;
    private final GetListMedicamentsUseCase getListMedicamentsUseCase;
    private final GetMedicamentUseCase getMedicamentUseCase;

    public MedicamentService(SaveMedicamentUseCase saveMedicamentUseCase, GetListMedicamentsUseCase getListMedicamentsUseCase, GetMedicamentUseCase getMedicamentUseCase) {
        this.saveMedicamentUseCase = saveMedicamentUseCase;
        this.getListMedicamentsUseCase = getListMedicamentsUseCase;
        this.getMedicamentUseCase = getMedicamentUseCase;
    }

    public Medicament saveMedicament(Medicament medicament) {
        return saveMedicamentUseCase.execute(medicament);
    }

    public List<Medicament> getListMedicaments() {
        return getListMedicamentsUseCase.execute();
    }

    public Optional<Medicament> getMedicamentById(String id) {
        return getMedicamentUseCase.execute(id);
    }
}
