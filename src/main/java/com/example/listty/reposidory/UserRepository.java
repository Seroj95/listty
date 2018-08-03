package com.example.listty.reposidory;


import com.example.listty.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
    User findOneByEmail(String s);
}

