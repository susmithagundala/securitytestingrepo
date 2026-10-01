package com.training.lab;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import javax.xml.parsers.*;
import org.xml.sax.InputSource;
import org.w3c.dom.Document;

@RestController
public class LabController {
    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("lab", "Plaintext password comparison", "category", "Authentication Failures", "endpoint",
                "See README.md");
    }

    @GetMapping("/api/ping")
    public Map<String, String> ping() {
        return Map.of("status", "ok");
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam String user, @RequestParam String password) {
        if ("alice".equals(user) && "alice123".equals(password))
            return Map.of("authenticated", true);
        return Map.of("authenticated", false);
    }
}