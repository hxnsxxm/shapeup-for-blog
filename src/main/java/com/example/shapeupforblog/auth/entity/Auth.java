package com.example.shapeupforblog.auth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@Table(name = "auth")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Auth {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "role")
    private String role;

    @Column(name = "social_id")
    private String socialId;

    @Column(name = "social_provider")
    private String socialProvider;

    @Column(name = "refresh_token")
    private String refreshToken;
}
