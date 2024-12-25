package com.example.diplom.dtos;

import java.time.LocalDateTime;

public record SignatureDto(

        Long id,

        String name,

        LocalDateTime createdAt,

        LocalDateTime updatedAt
) {
}
