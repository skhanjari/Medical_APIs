package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.Clinic;
import com.example.rahmaproject.domain.repository.ClinicRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.ClinicMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClinicRepoImpl implements ClinicRepository {
    private final ClinicRepo clinicRepo;

    public ClinicRepoImpl(@Lazy ClinicRepo clinicRepo) {
        this.clinicRepo = clinicRepo;
    }

    @Override
    public Clinic save(Clinic clinic) {
        return ClinicMapper.toDomain(clinicRepo.save(ClinicMapper.toEntity(clinic)));
    }

    @Override
    public List<Clinic> findAll() {
        return List.of();
    }

    @Override
    public Optional<Clinic> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Clinic> findAllClinics() {
        return clinicRepo.findAll()
                .stream()
                .map(ClinicMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Clinic> findClinicById(String id) {
        return clinicRepo.findById(id)
                .map(ClinicMapper::toDomain);
    }
}

