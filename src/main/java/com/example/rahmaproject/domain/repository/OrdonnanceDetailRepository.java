package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.OrdonnanceDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface OrdonnanceDetailRepository {
    OrdonnanceDetail save(OrdonnanceDetail ordonnanceDetail);
    List<OrdonnanceDetail> findAll();
    Optional<OrdonnanceDetail> findById(String id);

    List<OrdonnanceDetail> findAllOrdonnanceDetails();

    Optional<OrdonnanceDetail> findOrdonnanceDetailById(String id);
}

