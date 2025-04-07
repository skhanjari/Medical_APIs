package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.Ordonnance;
import com.example.rahmaproject.domain.repository.OrdonnanceRepository;
import com.example.rahmaproject.infrastructure.persistence.entity.OrdonnanceEntity;
import com.example.rahmaproject.infrastructure.persistence.mapper.OrdonnanceMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class OrdonnanceRepoImpl implements OrdonnanceRepository {
    private final OrdonnanceRepo ordonnanceRepo;

    public OrdonnanceRepoImpl(@Lazy OrdonnanceRepo ordonnanceRepo) {
        this.ordonnanceRepo = ordonnanceRepo;
    }

    @Override
    public Ordonnance save(Ordonnance ordonnance) {
        // Conversion du modèle domaine en entité, sauvegarde et retour en domaine
        OrdonnanceEntity entity = OrdonnanceMapper.toEntity(ordonnance);
        OrdonnanceEntity savedEntity = ordonnanceRepo.save(entity);
        return OrdonnanceMapper.toDomain(savedEntity);
    }

    @Override
    public List<Ordonnance> findAllOrdonnances() {

        return ordonnanceRepo.findAll()
                .stream()
                .map(OrdonnanceMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Ordonnance> findOrdonnanceById(String id) {

        return ordonnanceRepo.findById(id)
                .map(OrdonnanceMapper::toDomain);
    }

    @Override
    public Ordonnance CreateOrdonnance(Ordonnance ordonnance) {
        return null;
    }

    @Override
    public Ordonnance update(Ordonnance ordonnance) {
        OrdonnanceEntity entity = OrdonnanceMapper.toEntity(ordonnance);
        OrdonnanceEntity updatedEntity = ordonnanceRepo.save(entity); // La méthode save de JpaRepository fait aussi la mise à jour
        return OrdonnanceMapper.toDomain(updatedEntity);
    }

    @Override
    public void deleteById(String id) {
        ordonnanceRepo.deleteById(id);
    }
}

