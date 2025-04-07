package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.ServiceStaff;
import com.example.rahmaproject.domain.repository.ServiceStaffRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.ServiceStaffMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ServiceStaffRepoImpl implements ServiceStaffRepository {
    private final ServiceStaffRepo serviceStaffRepo;

    public ServiceStaffRepoImpl(@Lazy ServiceStaffRepo serviceStaffRepo) {
        this.serviceStaffRepo = serviceStaffRepo;
    }

    @Override
    public ServiceStaff save(ServiceStaff serviceStaff) {
        return ServiceStaffMapper.toDomain(serviceStaffRepo.save(ServiceStaffMapper.toEntity(serviceStaff)));
    }

    @Override
    public List<ServiceStaff> findAll() {
        return List.of();
    }

    @Override
    public Optional<ServiceStaff> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<ServiceStaff> findAllServiceStaff() {
        return serviceStaffRepo.findAll()
                .stream()
                .map(ServiceStaffMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<ServiceStaff> findServiceStaffById(String id) {
        return serviceStaffRepo.findById(id)
                .map(ServiceStaffMapper::toDomain);
    }
}

