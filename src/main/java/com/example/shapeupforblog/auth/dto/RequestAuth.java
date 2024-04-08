package com.example.shapeupforblog.auth.dto;

import lombok.Data;

@Data
public class RequestAuth {

    /**
     * OAuth 로그인에서 제공하는 고유 ID
     * e.g. Kakao  : 123456789
     * e.g. Google : 103707946781717949594
     */
    private String socialId;
    /**
     * OAuth 로그인 경로
     */
    private String socialProvider;
}
