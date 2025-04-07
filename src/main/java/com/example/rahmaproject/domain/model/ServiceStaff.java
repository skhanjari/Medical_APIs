package com.example.rahmaproject.domain.model;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ServiceStaff {
    private String id;
    private String staffId;
    private String serviceId;
}
