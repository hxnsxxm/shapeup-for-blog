package com.example.shapeupforblog.auth.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthDto {

    private String uuid;
    private String role;
    private String socialId;
    private String socialProvider;
    private String refreshToken;
}
