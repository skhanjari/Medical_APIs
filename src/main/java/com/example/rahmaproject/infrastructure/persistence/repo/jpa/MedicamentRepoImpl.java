package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.Medicament;
import com.example.rahmaproject.domain.repository.MedicamentRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.MedicamentMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicamentRepoImpl implements MedicamentRepository {
    private final MedicamentRepo medicamentRepo;

    public MedicamentRepoImpl(@Lazy MedicamentRepo medicamentRepo) {
        this.medicamentRepo = medicamentRepo;
    }

    @Override
    public Medicament save(Medicament medicament) {
        return MedicamentMapper.toDomain(medicamentRepo.save(MedicamentMapper.toEntity(medicament)));
    }

    @Override
    public List<Medicament> findAll() {
        return List.of();
    }

    @Override
    public Optional<Medicament> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Medicament> findAllMedicaments() {
        return medicamentRepo.findAll()
                .stream()
                .map(MedicamentMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Medicament> findMedicamentById(String id) {
        return medicamentRepo.findById(id)
                .map(MedicamentMapper::toDomain);
    }
}

