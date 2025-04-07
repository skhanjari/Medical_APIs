package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Staff;
import com.example.rahmaproject.domain.repository.StaffRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class GetListStaffUseCase {
    private final StaffRepository staffRepository;

    public GetListStaffUseCase(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> execute() {
        return staffRepository.findAll();
    }
}

