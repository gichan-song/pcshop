package com.sparta.pcshop.user.domain.repository;

import com.sparta.pcshop.user.domain.model.User;

public interface UserRepository {
    User save(User user);
}
