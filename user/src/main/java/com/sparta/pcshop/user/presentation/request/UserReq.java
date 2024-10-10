package com.sparta.pcshop.user.presentation.request;

public record UserReq(
        String name,
        String email,
        String password
) {
}
