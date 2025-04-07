package com.example.rahmaproject.application.service;

import com.example.rahmaproject.application.usecase.GetListStaffUseCase;
import com.example.rahmaproject.application.usecase.GetStaffUseCase;
import com.example.rahmaproject.application.usecase.SaveStaffUseCase;
import com.example.rahmaproject.domain.model.Staff;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class StaffService {
    private final SaveStaffUseCase saveStaffUseCase;
    private final GetListStaffUseCase getListStaffUseCase;
    private final GetStaffUseCase getStaffUseCase;

    public StaffService(SaveStaffUseCase saveStaffUseCase, GetListStaffUseCase getListStaffUseCase, GetStaffUseCase getStaffUseCase) {
        this.saveStaffUseCase = saveStaffUseCase;
        this.getListStaffUseCase = getListStaffUseCase;
        this.getStaffUseCase = getStaffUseCase;
    }

    public Staff saveStaff(Staff staff) {
        return saveStaffUseCase.execute(staff);
    }

    public List<Staff> getListStaff() {
        return getListStaffUseCase.execute();
    }

    public Optional<Staff> getStaffById(String id) {
        return getStaffUseCase.execute(id);
    }
}

