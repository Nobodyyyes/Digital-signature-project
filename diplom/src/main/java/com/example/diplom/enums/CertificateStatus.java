package com.example.diplom.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CertificateStatus {

    ACTIVE("Активный"),
    REVOKED("Отозванный"),
    EXPIRED("Истекший");

    private final String description;
}
