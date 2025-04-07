package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.Consultation;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface ConsultationRepository {
    Consultation save(Consultation consultation);
    List<Consultation> findAll();
    Optional<Consultation> findById(String id);
    Consultation update(Consultation consultation);
    void deleteById(String id);


}

