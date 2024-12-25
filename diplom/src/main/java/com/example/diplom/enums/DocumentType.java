package com.example.diplom.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum DocumentType {

    PDF("PDF"),
    DOCX("DOCX"),
    TXT("TXT");

    private final String description;
}
