package com.example.redditbackend.controller;

import com.example.redditbackend.dto.RegisterRequest;
import com.example.redditbackend.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping("/") // Define a new GET mapping for the root endpoint
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("Welcome to Reddit Backend API", OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successful",
                OK);
    }



}
