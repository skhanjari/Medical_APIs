package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListOrdonnanceDetailsUseCase;
import com.example.rahmaproject.application.usecase.GetOrdonnanceDetailUseCase;
import com.example.rahmaproject.application.usecase.SaveOrdonnanceDetailUseCase;
import com.example.rahmaproject.domain.model.OrdonnanceDetail;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class OrdonnanceDetailService {
    private final SaveOrdonnanceDetailUseCase saveOrdonnanceDetailUseCase;
    private final GetListOrdonnanceDetailsUseCase getListOrdonnanceDetailsUseCase;
    private final GetOrdonnanceDetailUseCase getOrdonnanceDetailUseCase;

    public OrdonnanceDetailService(SaveOrdonnanceDetailUseCase saveOrdonnanceDetailUseCase, GetListOrdonnanceDetailsUseCase getListOrdonnanceDetailsUseCase, GetOrdonnanceDetailUseCase getOrdonnanceDetailUseCase) {
        this.saveOrdonnanceDetailUseCase = saveOrdonnanceDetailUseCase;
        this.getListOrdonnanceDetailsUseCase = getListOrdonnanceDetailsUseCase;
        this.getOrdonnanceDetailUseCase = getOrdonnanceDetailUseCase;
    }

    public OrdonnanceDetail saveOrdonnanceDetail(OrdonnanceDetail ordonnanceDetail) {
        return saveOrdonnanceDetailUseCase.execute(ordonnanceDetail);
    }

    public List<OrdonnanceDetail> getListOrdonnanceDetails() {
        return getListOrdonnanceDetailsUseCase.execute();
    }

    public Optional<OrdonnanceDetail> getOrdonnanceDetailById(String id) {
        return getOrdonnanceDetailUseCase.execute(id);
    }
}

