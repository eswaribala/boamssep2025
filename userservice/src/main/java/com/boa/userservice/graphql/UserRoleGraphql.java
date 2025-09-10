package com.boa.userservice.graphql;

import com.boa.userservice.models.User;
import com.boa.userservice.repositories.RoleRepository;
import com.boa.userservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserRoleGraphql {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    //====Query=====

    @QueryMapping
    public List<User> users(){
        return userRepository.findAll();
    }

}
