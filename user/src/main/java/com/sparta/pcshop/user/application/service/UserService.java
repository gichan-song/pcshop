package com.sparta.pcshop.user.application.service;

import com.sparta.pcshop.user.application.dto.UserDto;
import com.sparta.pcshop.user.domain.model.User;
import com.sparta.pcshop.user.domain.repository.UserRepository;
import com.sparta.pcshop.user.presentation.request.UserReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto addUser(UserReq req) {
        User user = new User(req.name(), req.email(), req.password());
        userRepository.save(user);

        return null;
    }
}
