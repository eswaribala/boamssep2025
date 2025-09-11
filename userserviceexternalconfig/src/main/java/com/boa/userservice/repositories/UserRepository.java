package com.boa.userservice.repositories;

import com.boa.userservice.models.FullName;
import com.boa.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {

          Optional<User> findByEmail(String email);
          boolean existsByEmail(String email);
          Optional<User> findByFullName(FullName fullName );


}
