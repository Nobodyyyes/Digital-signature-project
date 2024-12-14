package com.example.diplom.service.key.impl;

import com.example.diplom.model.key.KeyModel;
import com.example.diplom.service.key.KeyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KeyServiceImpl implements KeyService {

    @Override
    public KeyModel getKey(Long id) {
        return null;
    }

    @Override
    public List<KeyModel> getAllKeys() {
        return List.of();
    }

    @Override
    public KeyModel generateKey(KeyModel newKey) {
        return null;
    }

    @Override
    public void deleteKey(Long id) {

    }
}
