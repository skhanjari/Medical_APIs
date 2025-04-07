package com.example.rahmaproject.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Staff {
    private String id;
    private String name;
    private String role;
    private String clinicId;
}

