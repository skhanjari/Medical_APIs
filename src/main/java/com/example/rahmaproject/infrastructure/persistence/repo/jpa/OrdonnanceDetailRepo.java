package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.infrastructure.persistence.entity.OrdonnanceDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdonnanceDetailRepo extends JpaRepository<OrdonnanceDetailEntity, String> {

}

