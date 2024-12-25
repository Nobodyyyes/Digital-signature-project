package com.example.diplom.controllers;

import com.example.diplom.dtos.KeyDto;
import com.example.diplom.entities.Key;
import com.example.diplom.services.key.KeyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/keys")
@RequiredArgsConstructor
public class KeysManagementController {

    private final KeyService keyService;

    @GetMapping("/{id}")
    public KeyDto getKeyById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/all")
    public List<KeyDto> getAllKeys() {
        return Key.toDtoList(keyService.getAllKeys());
    }

    @PostMapping("/generate")
    public KeyDto generateKey(@RequestBody Key key) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteKey(@PathVariable Long id) {

    }
}
