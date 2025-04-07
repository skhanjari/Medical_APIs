package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.Service;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface ServiceRepository {
    Service save(Service service);
    List<Service> findAll();
    Optional<Service> findById(String id);

    List<Service> findAllServices();

    Optional<Service> findServiceById(String id);
}

