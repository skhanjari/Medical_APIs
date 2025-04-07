package com.example.rahmaproject.application.usecase;

import com.example.rahmaproject.domain.model.Staff;
import com.example.rahmaproject.domain.repository.StaffRepository;
import org.springframework.stereotype.Component;

@Component

public class SaveStaffUseCase {
    private final StaffRepository staffRepository;

    public SaveStaffUseCase(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public Staff execute(Staff staff) {
        return staffRepository.save(staff);
    }
}
