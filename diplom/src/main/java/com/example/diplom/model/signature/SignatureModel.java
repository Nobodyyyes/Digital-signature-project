package com.example.diplom.model.signature;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignatureModel {

    Long id;
    String name;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
