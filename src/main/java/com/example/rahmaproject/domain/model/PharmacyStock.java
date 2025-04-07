package com.example.rahmaproject.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PharmacyStock {
    private String id;
    private String pharmacyId;
    private String medicamentId;
    private int quantity;
}
