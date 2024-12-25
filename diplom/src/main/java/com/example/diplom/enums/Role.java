package com.example.diplom.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {

    USER("Пользователь"),
    ADMIN("Администратор");

    private final String description;
}
