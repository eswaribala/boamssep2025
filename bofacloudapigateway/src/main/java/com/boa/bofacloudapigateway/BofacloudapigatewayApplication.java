package com.boa.bofacloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BofacloudapigatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BofacloudapigatewayApplication.class, args);
    }

}
