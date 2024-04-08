package com.example.shapeupforblog.auth.service;

import com.example.shapeupforblog.auth.dto.AuthDto;
import com.example.shapeupforblog.auth.dto.RequestAuth;
import com.example.shapeupforblog.auth.entity.Auth;
import com.example.shapeupforblog.auth.repository.AuthRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthService {

    private final AuthRepository authRepository;

    public AuthDto socialLogin(RequestAuth requestAuth) {

        String socialId = requestAuth.getSocialId();
        String socialProvider = requestAuth.getSocialProvider();

        Auth auth;
        AuthDto authDto;

        if (!authRepository.existsBySocialIdAndSocialProvider(socialId, socialProvider)) {
            Auth newAuth = Auth.builder()
                    .uuid(UUID.randomUUID().toString())
                    .role("ROLE_USER")
                    .socialId(socialId)
                    .socialProvider(socialProvider)
                    .build();

            auth = authRepository.save(newAuth);
        } else {
            auth = authRepository.findBySocialIdAndSocialProvider(socialId, socialProvider);
        }

        authDto = AuthDto.builder()
                .uuid(auth.getUuid())
                .role(auth.getRole())
                .socialId(auth.getSocialId())
                .socialProvider(auth.getSocialProvider())
                .build();

        return authDto;
    }
}
