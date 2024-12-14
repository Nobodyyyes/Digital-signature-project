package com.example.diplom.service.key;

import com.example.diplom.model.key.KeyModel;

import java.util.List;

public interface KeyService {

    KeyModel getKey(Long id);

    List<KeyModel> getAllKeys();

    KeyModel generateKey(KeyModel newKey);

    void deleteKey(Long id);
}
