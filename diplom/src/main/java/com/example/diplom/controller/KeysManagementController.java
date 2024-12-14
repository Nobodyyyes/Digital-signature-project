package com.example.diplom.controller;

import com.example.diplom.dto.KeyDto;
import com.example.diplom.model.key.KeyModel;
import com.example.diplom.service.key.KeyService;
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
        return KeyModel.toDtoList(keyService.getAllKeys());
    }

    @PostMapping("/generate")
    public KeyDto generateKey(@RequestBody KeyModel keyModel) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteKey(@PathVariable Long id) {

    }
}
