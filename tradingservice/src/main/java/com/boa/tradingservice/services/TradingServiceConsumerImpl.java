package com.boa.tradingservice.services;

import com.boa.tradingservice.dtos.UserDTO;
import com.boa.tradingservice.repositories.UserRepository;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@KafkaListener(topics = "bofauserdata",groupId = "saga-trader-group")
@Slf4j
public class TradingServiceConsumerImpl implements TradingServiceConsumer {

    @Autowired
    private UserRepository  userRepository;

    @Override
    @KafkaHandler(isDefault = true)
    public void consumeUserData(String data) {

        log.info("Consumed Data"+data);
        Gson gson = new Gson();
        UserDTO userDTO= gson.fromJson(data, UserDTO.class);
        log.info("UserDTO"+userDTO);
        userRepository.save(userDTO);


    }
}
