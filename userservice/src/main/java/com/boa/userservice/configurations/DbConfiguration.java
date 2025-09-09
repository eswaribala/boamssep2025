package com.boa.userservice.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfiguration {

    @Value("${drivername}")
    private String driverName;
    @Value("${url}")
    private String url;
    @Value("${mysql_userName}")
    private String mysqlUserName;
    @Value("${password}")
    private String password;


    private DataSourceBuilder  dataSourceBuilder;

    @Bean
    public DataSource createDataSource(){

        System.out.println(url);
        System.out.println(mysqlUserName);
        System.out.println(password);
        System.out.println(driverName);
        dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driverName);
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(mysqlUserName);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }



}
