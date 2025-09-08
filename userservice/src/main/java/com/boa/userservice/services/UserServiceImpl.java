package com.boa.userservice.services;

import com.boa.userservice.dtos.CreateUserRequest;
import com.boa.userservice.dtos.UpdateUserRequestDTO;
import com.boa.userservice.models.FullName;
import com.boa.userservice.models.User;
import com.boa.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(CreateUserRequest createUserRequest) {


       User user = User.builder()
               .fullName(FullName.builder()
                       .firstName(createUserRequest.getFullNameDTO().getFirstName())
                       .lastName(createUserRequest.getFullNameDTO().getLastName())
                       .middleName(createUserRequest.getFullNameDTO().getMidddleName())
                       .build())
               .email(createUserRequest.getEmail())
               .roles(null)
               .build();

        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public boolean deleteUserById(String id) {
        return false;
    }

    @Override
    public User updateUser(UpdateUserRequestDTO updateUserRequestDTO) {
        return null;
    }
}
