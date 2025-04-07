package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.PharmacyStock;
import com.example.rahmaproject.domain.repository.PharmacyStockRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.PharmacyStockMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PharmacyStockRepoImpl implements PharmacyStockRepository {
    private final PharmacyStockRepo pharmacyStockRepo;

    public PharmacyStockRepoImpl(@Lazy PharmacyStockRepo pharmacyStockRepo) {
        this.pharmacyStockRepo = pharmacyStockRepo;
    }

    @Override
    public PharmacyStock save(PharmacyStock pharmacyStock) {
        return PharmacyStockMapper.toDomain(pharmacyStockRepo.save(PharmacyStockMapper.toEntity(pharmacyStock)));
    }

    @Override
    public List<PharmacyStock> findAll() {
        return List.of();
    }

    @Override
    public Optional<PharmacyStock> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<PharmacyStock> findAllPharmacyStock() {
        return pharmacyStockRepo.findAll()
                .stream()
                .map(PharmacyStockMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<PharmacyStock> findPharmacyStockById(String id) {
        return pharmacyStockRepo.findById(id)
                .map(PharmacyStockMapper::toDomain);
    }
}
