package com.example.sql.app.service;

import com.example.sql.app.entity.UserEntity;
import com.example.sql.app.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class UserService {

    UserRepository userRepository;

    public List<UserEntity> selectAll(){
        return userRepository.findAll();
    }

    public Optional<UserEntity> findUserById(Integer id){
        return userRepository.findById(id);
    }
    public void create(UserEntity userEntity){
        userRepository.save(userEntity);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);

    }


}
