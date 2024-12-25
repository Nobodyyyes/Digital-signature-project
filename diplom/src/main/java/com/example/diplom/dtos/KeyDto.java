package com.example.diplom.dtos;

import lombok.Builder;

@Builder(toBuilder = true)
public record KeyDto(

        Long id,

        String keyName,

        String publicKey,

        String privateKey
) {
}
