package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.MedicalTest;
import com.example.rahmaproject.domain.repository.MedicalTestRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.MedicalTestMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicalTestRepoImpl implements MedicalTestRepository {
    private final MedicalTestRepo medicalTestRepo;

    public MedicalTestRepoImpl(@Lazy MedicalTestRepo medicalTestRepo) {
        this.medicalTestRepo = medicalTestRepo;
    }

    @Override
    public MedicalTest save(MedicalTest medicalTest) {
        return MedicalTestMapper.toDomain(medicalTestRepo.save(MedicalTestMapper.toEntity(medicalTest)));
    }

    @Override
    public List<MedicalTest> findAll() {
        return List.of();
    }

    @Override
    public Optional<MedicalTest> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<MedicalTest> findAllMedicalTests() {
        return medicalTestRepo.findAll()
                .stream()
                .map(MedicalTestMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<MedicalTest> findMedicalTestById(String id) {
        return medicalTestRepo.findById(id)
                .map(MedicalTestMapper::toDomain);
    }
}

