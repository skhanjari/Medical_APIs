package com.example.rahmaproject.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class OrdonnanceDetail {
    private String id;
    private String ordonnanceId;
    private String medicamentId;
    private String dosage;
    private int durationInDays;
}
