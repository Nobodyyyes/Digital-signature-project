package com.example.diplom.enums.key;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum KeyStatus {

    ACTIVE("Активный"),
    REVOKED("Отозванный");

    private final String description;
}
