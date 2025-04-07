package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.Consultation;
import com.example.rahmaproject.domain.repository.ConsultationRepository;
import com.example.rahmaproject.infrastructure.persistence.entity.ConsultationEntity;
import com.example.rahmaproject.infrastructure.persistence.mapper.ConsultationMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ConsultationRepoImpl implements ConsultationRepository {

    private final ConsultationRepo consultationRepo;

    public ConsultationRepoImpl(@Lazy ConsultationRepo consultationRepo) {
        this.consultationRepo = consultationRepo;
    }

    @Override
    public Consultation save(Consultation consultation) {
        // Domaine -> Entité
        ConsultationEntity entity = ConsultationMapper.toEntity(consultation);
        // Persistance
        ConsultationEntity savedEntity = consultationRepo.save(entity);
        // Entité -> Domaine
        return ConsultationMapper.toDomain(savedEntity);
    }

    @Override
    public List<Consultation> findAll() {
        return consultationRepo.findAll().stream()
                .map(ConsultationMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Consultation> findById(String id) {
        return consultationRepo.findById(id)
                .map(ConsultationMapper::toDomain);
    }
    @Override
    public Consultation update(Consultation consultation) {
        ConsultationEntity entity = ConsultationMapper.toEntity(consultation);
        ConsultationEntity updatedEntity = consultationRepo.save(entity); // La méthode save de JpaRepository fait aussi la mise à jour
        return ConsultationMapper.toDomain(updatedEntity);
    }

    @Override
    public void deleteById(String id) {
        consultationRepo.deleteById(id);
    }
}

