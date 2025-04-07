package com.example.rahmaproject.web.controller;

import com.example.rahmaproject.application.service.StaffService;
import com.example.rahmaproject.domain.model.Staff;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/staff")
@CrossOrigin
public class StaffController {
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @PostMapping("/add")
    public Staff saveStaff(@RequestBody Staff staff) {
        return staffService.saveStaff(staff);
    }

    @GetMapping
    public List<Staff> getListStaff() {
        return staffService.getListStaff();
    }

    @GetMapping("/{id}")
    public Optional<Staff> getStaff(@PathVariable String id) {
        return staffService.getStaffById(id);
    }
}

