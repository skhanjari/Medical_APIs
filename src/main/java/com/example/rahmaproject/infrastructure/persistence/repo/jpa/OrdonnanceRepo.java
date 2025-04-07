package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.infrastructure.persistence.entity.OrdonnanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdonnanceRepo extends JpaRepository<OrdonnanceEntity, String> {

}

