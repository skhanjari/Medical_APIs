package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.OrdonnanceDetail;
import com.example.rahmaproject.domain.repository.OrdonnanceDetailRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.OrdonnanceDetailMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrdonnanceDetailRepoImpl implements OrdonnanceDetailRepository {
    private final OrdonnanceDetailRepo ordonnanceDetailRepo;

    public OrdonnanceDetailRepoImpl(@Lazy OrdonnanceDetailRepo ordonnanceDetailRepo) {
        this.ordonnanceDetailRepo = ordonnanceDetailRepo;
    }

    @Override
    public OrdonnanceDetail save(OrdonnanceDetail ordonnanceDetail) {
        return OrdonnanceDetailMapper.toDomain(ordonnanceDetailRepo.save(OrdonnanceDetailMapper.toEntity(ordonnanceDetail)));
    }

    @Override
    public List<OrdonnanceDetail> findAll() {
        return List.of();
    }

    @Override
    public Optional<OrdonnanceDetail> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<OrdonnanceDetail> findAllOrdonnanceDetails() {
        return ordonnanceDetailRepo.findAll()
                .stream()
                .map(OrdonnanceDetailMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<OrdonnanceDetail> findOrdonnanceDetailById(String id) {
        return ordonnanceDetailRepo.findById(id)
                .map(OrdonnanceDetailMapper::toDomain);
    }
}

