package com.example.diplom.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SignatureStatus {

    ACTIVE("Действительный"),
    EXPIRED("Истекший"),
    NONACTIVE("Недействительный");

    private final String description;
}
