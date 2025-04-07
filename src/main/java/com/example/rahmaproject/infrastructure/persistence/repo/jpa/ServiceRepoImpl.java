package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.Service;
import com.example.rahmaproject.domain.repository.ServiceRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.ServiceMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ServiceRepoImpl implements ServiceRepository {
    private final ServiceRepo serviceRepo;

    public ServiceRepoImpl(@Lazy ServiceRepo serviceRepo) {
        this.serviceRepo = serviceRepo;
    }

    @Override
    public Service save(Service service) {
        return ServiceMapper.toDomain(serviceRepo.save(ServiceMapper.toEntity(service)));
    }

    @Override
    public List<Service> findAll() {
        return List.of();
    }

    @Override
    public Optional<Service> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Service> findAllServices() {
        return serviceRepo.findAll()
                .stream()
                .map(ServiceMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Service> findServiceById(String id) {
        return serviceRepo.findById(id)
                .map(ServiceMapper::toDomain);
    }
}

