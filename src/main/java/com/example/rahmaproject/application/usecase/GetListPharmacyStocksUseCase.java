package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.PharmacyStock;
import com.example.rahmaproject.domain.repository.PharmacyStockRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetListPharmacyStocksUseCase {
    private final PharmacyStockRepository repository;

    public GetListPharmacyStocksUseCase(PharmacyStockRepository repository) {
        this.repository = repository;
    }

    public List<PharmacyStock> execute() {
        return repository.findAll();
    }
}
