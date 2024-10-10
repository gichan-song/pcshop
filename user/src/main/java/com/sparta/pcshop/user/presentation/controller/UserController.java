package com.sparta.pcshop.user.presentation.controller;

import com.sparta.pcshop.user.application.dto.UserDto;
import com.sparta.pcshop.user.presentation.request.UserReq;
import com.sparta.pcshop.user.application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserDto> addUser(@RequestBody UserReq req) {
        return ResponseEntity.ok(userService.addUser(req));
    }
}
