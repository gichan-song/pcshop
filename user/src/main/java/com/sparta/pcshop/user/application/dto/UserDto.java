package com.sparta.pcshop.user.application.dto;

import org.bson.types.ObjectId;

public record UserDto(
        ObjectId id,
        String name
) {
}
