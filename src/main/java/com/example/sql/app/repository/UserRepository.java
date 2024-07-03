package com.example.sql.app.repository;

import com.example.sql.app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
