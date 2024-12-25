package com.example.diplom.enums.key;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum KeyType {

    PUBLIC("Публичный ключ"),
    PRIVATE("Приватный ключ");

    private final String description;
}
