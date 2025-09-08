package com.boa.userservice.dtos;

import com.boa.userservice.models.Role;
import com.boa.userservice.models.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper{
    CreateUserRequest toDTO(User user);
    CreateRoleRequest toDTO(Role role);
}
