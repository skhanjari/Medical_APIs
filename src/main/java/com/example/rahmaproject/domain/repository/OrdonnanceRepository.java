package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.Ordonnance;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface OrdonnanceRepository {
    Ordonnance save(Ordonnance ordonnance);
    List<Ordonnance> findAllOrdonnances();
    Optional<Ordonnance> findOrdonnanceById(String id);

    Ordonnance CreateOrdonnance(Ordonnance ordonnance);
    Ordonnance update(Ordonnance ordonnance);
    void deleteById(String id);
}


