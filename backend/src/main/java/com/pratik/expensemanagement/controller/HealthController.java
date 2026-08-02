package com.pratik.expensemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        final Map<String,String> response = new HashMap<>();
        return Map.of(
                "status", "UP",
                "application", "Expense Management System"
        );
    }

}
