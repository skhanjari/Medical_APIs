package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.ServiceStaff;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface ServiceStaffRepository {
    ServiceStaff save(ServiceStaff serviceStaff);
    List<ServiceStaff> findAll();
    Optional<ServiceStaff> findById(String id);

    List<ServiceStaff> findAllServiceStaff();

    Optional<ServiceStaff> findServiceStaffById(String id);
}

