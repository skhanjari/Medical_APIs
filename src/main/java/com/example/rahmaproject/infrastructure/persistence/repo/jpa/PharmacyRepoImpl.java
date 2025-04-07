package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.Pharmacy;
import com.example.rahmaproject.domain.repository.PharmacyRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.PharmacyMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PharmacyRepoImpl implements PharmacyRepository {
    private final PharmacyRepo pharmacyRepo;

    public PharmacyRepoImpl(@Lazy PharmacyRepo pharmacyRepo) {
        this.pharmacyRepo = pharmacyRepo;
    }

    @Override
    public Pharmacy save(Pharmacy pharmacy) {
        return PharmacyMapper.toDomain(pharmacyRepo.save(PharmacyMapper.toEntity(pharmacy)));
    }

    @Override
    public List<Pharmacy> findAll() {
        return List.of();
    }

    @Override
    public Optional<Pharmacy> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Pharmacy> findAllPharmacies() {
        return pharmacyRepo.findAll()
                .stream()
                .map(PharmacyMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Pharmacy> findPharmacyById(String id) {
        return pharmacyRepo.findById(id)
                .map(PharmacyMapper::toDomain);
    }
}

