package com.sparta.pcshop.user.infrastructure.repository;

import com.sparta.pcshop.user.domain.model.User;
import com.sparta.pcshop.user.domain.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User, ObjectId>, UserRepository {
}
