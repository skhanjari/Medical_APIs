package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Staff;
import com.example.rahmaproject.domain.repository.StaffRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component

public class GetStaffUseCase {
    private final StaffRepository staffRepository;

    public GetStaffUseCase(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public Optional<Staff> execute(String id) {
        return staffRepository.findById(id);
    }
}
