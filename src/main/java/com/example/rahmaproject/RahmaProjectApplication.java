package com.example.rahmaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.rahmaproject") // ✅ Ajoute cette ligne
public class RahmaProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(RahmaProjectApplication.class, args);
    }
}

