package com.wellcolleague.inhouseculture.web.controller;


import com.wellcolleague.inhouseculture.web.dto.user.LoginRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public ResponseEntity<?> authLoginUser(@Valid @RequestBody LoginRequestDto loginRequestDto){
        return ResponseEntity.ok("hi");
    }

}
