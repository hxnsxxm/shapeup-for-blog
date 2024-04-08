package com.example.shapeupforblog.auth.controller;

import com.example.shapeupforblog.auth.dto.AuthDto;
import com.example.shapeupforblog.auth.dto.RequestAuth;
import com.example.shapeupforblog.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/v1/social-login")
    public ResponseEntity<AuthDto> socialLogin(@RequestBody RequestAuth requestAuth) {
        AuthDto savedOrFindUser = authService.socialLogin(requestAuth);

        return ResponseEntity.ok(savedOrFindUser);
    }
}
