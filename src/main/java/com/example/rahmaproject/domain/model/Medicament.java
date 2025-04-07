package com.example.rahmaproject.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Medicament {
    private String id;
    private String name;
    private String type;
    private String pharmacyId;
}
