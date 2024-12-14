package com.example.diplom.dto;

import java.time.LocalDateTime;

public record SignatureDto(

        Long id,

        String name,

        LocalDateTime createdAt,

        LocalDateTime updatedAt
) {
}
