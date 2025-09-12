package com.boa.tradingservice.repositories;

import com.boa.tradingservice.dtos.UserDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDTO,String> {

}
