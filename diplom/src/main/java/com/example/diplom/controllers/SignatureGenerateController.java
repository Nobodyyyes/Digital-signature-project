package com.example.diplom.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signature")
@RequiredArgsConstructor
public class SignatureGenerateController {

    @GetMapping("/generate")
    public String generateSignature() {
        return null;
    }
}
