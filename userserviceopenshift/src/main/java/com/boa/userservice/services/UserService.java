package com.boa.userservice.services;

import com.boa.userservice.dtos.CreateUserRequest;
import com.boa.userservice.dtos.UpdateUserRequestDTO;
import com.boa.userservice.models.User;
import com.fasterxml.jackson.core.JsonProcessingException;


import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface UserService {

    User createUser(CreateUserRequest createUserRequest);
    List<User> getAllUsers();
    User getUserById(String id);
    boolean deleteUserById(String id);
    User updateUser(UpdateUserRequestDTO updateUserRequestDTO);


}
