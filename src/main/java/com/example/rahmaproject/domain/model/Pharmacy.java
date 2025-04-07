package com.example.rahmaproject.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Pharmacy {
    private String id;
    private String name;
    private String location;
}
