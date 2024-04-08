package com.example.shapeupforblog.auth.repository;

import com.example.shapeupforblog.auth.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Auth, String> {

    Auth findBySocialIdAndSocialProvider(String socialId, String socialProvider);
    Boolean existsBySocialIdAndSocialProvider(String socialId, String socialProvider);
}
