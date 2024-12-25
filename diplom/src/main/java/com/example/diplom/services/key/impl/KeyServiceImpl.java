package com.example.diplom.services.key.impl;

import com.example.diplom.entities.Key;
import com.example.diplom.services.key.KeyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KeyServiceImpl implements KeyService {

    @Override
    public Key getKey(Long id) {
        return null;
    }

    @Override
    public List<Key> getAllKeys() {
        return List.of();
    }

    @Override
    public Key generateKey(Key newKey) {
        return null;
    }

    @Override
    public void deleteKey(Long id) {

    }
}
