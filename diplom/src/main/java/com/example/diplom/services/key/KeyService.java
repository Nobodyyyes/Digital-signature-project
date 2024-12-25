package com.example.diplom.services.key;

import com.example.diplom.entities.Key;

import java.util.List;

public interface KeyService {

    Key getKey(Long id);

    List<Key> getAllKeys();

    Key generateKey(Key newKey);

    void deleteKey(Long id);
}
