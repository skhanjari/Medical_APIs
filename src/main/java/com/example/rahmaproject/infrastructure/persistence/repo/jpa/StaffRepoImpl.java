package com.example.rahmaproject.infrastructure.persistence.repo.jpa;

import com.example.rahmaproject.domain.model.Staff;
import com.example.rahmaproject.domain.repository.StaffRepository;
import com.example.rahmaproject.infrastructure.persistence.mapper.StaffMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StaffRepoImpl implements StaffRepository {
    private final StaffRepo staffRepo;

    public StaffRepoImpl(@Lazy StaffRepo staffRepo) {
        this.staffRepo = staffRepo;
    }

    @Override
    public Staff save(Staff staff) {
        return StaffMapper.toDomain(staffRepo.save(StaffMapper.toEntity(staff)));
    }

    @Override
    public List<Staff> findAll() {
        return List.of();
    }

    @Override
    public Optional<Staff> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Staff> findAllStaff() {
        return staffRepo.findAll()
                .stream()
                .map(StaffMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Staff> findStaffById(String id) {
        return staffRepo.findById(id)
                .map(StaffMapper::toDomain);
    }
}

