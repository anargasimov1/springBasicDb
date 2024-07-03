package com.example.sql.app.controller;


import com.example.sql.app.entity.UserEntity;
import com.example.sql.app.service.UserService;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("db")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@CrossOrigin(origins = {"https://anargasimov.42web.io", "http://127.0.0.1:5500","https://cage.free.nf"})
public class UserController {

    UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserEntity> sayHello(){
        return userService.selectAll();
    }
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<UserEntity> byId(@PathVariable Integer id){
        if(userService.findUserById(id).isEmpty()){
            throw new RuntimeException("User with id: "+id +" not found");
        }
        return userService.findUserById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity save(@RequestBody UserEntity userEntity){
        userService.create(userEntity);
        return userEntity;
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void deleteUserById(@PathVariable Integer id){
        userService.deleteUser(id);
    }


}
