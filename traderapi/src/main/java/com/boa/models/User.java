package com.boa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("Trade-User")
public class User {

    private long userId;
    private String firstName;
    private String lastName;

    private String email;

    private List<Role> roles;
}
