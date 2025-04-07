package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListPharmacyStocksUseCase;
import com.example.rahmaproject.application.usecase.GetPharmacyStockUseCase;
import com.example.rahmaproject.application.usecase.SavePharmacyStockUseCase;
import com.example.rahmaproject.domain.model.PharmacyStock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class PharmacyStockService {
    private final SavePharmacyStockUseCase savePharmacyStockUseCase;
    private final GetListPharmacyStocksUseCase getListPharmacyStocksUseCase;
    private final GetPharmacyStockUseCase getPharmacyStockUseCase;

    public PharmacyStockService(SavePharmacyStockUseCase savePharmacyStockUseCase, GetListPharmacyStocksUseCase getListPharmacyStocksUseCase, GetPharmacyStockUseCase getPharmacyStockUseCase) {
        this.savePharmacyStockUseCase = savePharmacyStockUseCase;
        this.getListPharmacyStocksUseCase = getListPharmacyStocksUseCase;
        this.getPharmacyStockUseCase = getPharmacyStockUseCase;
    }

    public PharmacyStock savePharmacyStock(PharmacyStock pharmacyStock) {
        return savePharmacyStockUseCase.execute(pharmacyStock);
    }

    public List<PharmacyStock> getListPharmacyStocks() {
        return getListPharmacyStocksUseCase.execute();
    }

    public Optional<PharmacyStock> getPharmacyStockById(String id) {
        return getPharmacyStockUseCase.execute(id);
    }
}

