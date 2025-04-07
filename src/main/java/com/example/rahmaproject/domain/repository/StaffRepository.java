package com.example.rahmaproject.domain.repository;

import com.example.rahmaproject.domain.model.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface StaffRepository {
    Staff save(Staff staff);
    List<Staff> findAll();
    Optional<Staff> findById(String id);

    List<Staff> findAllStaff();

    Optional<Staff> findStaffById(String id);
}

