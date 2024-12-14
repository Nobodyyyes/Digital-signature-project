package com.example.diplom.dto;

import lombok.Builder;

@Builder(toBuilder = true)
public record KeyDto(

        Long id,

        String keyName,

        String publicKey,

        String privateKey
) {
}
