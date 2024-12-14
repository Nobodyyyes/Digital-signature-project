package com.example.diplom.model.key;

import com.example.diplom.dto.KeyDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KeyModel {
    Long id;
    String keyName;
    String publicKey;
    String privateKey;

    public KeyDto toDto() {
        return KeyDto.builder()
                .id(id)
                .keyName(keyName)
                .publicKey(publicKey)
                .privateKey(privateKey)
                .build();
    }

    public static List<KeyDto> toDtoList(List<KeyModel> models) {
        return models.stream()
                .map(KeyModel::toDto)
                .toList();
    }
}
