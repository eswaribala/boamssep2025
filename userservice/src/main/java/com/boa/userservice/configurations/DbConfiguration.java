package com.boa.userservice.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(EnvironmentConfiguration.class)
public class DbConfiguration {

  /*  @Value("${drivername}")
    private String driverName;
    @Value("${url}")
    private String url;
    @Value("${mysql_userName}")
    private String mysqlUserName;
    @Value("${password}")
    private String password;*/

    private final EnvironmentConfiguration environmentConfiguration;
    private DataSourceBuilder  dataSourceBuilder;

    public DbConfiguration(EnvironmentConfiguration _environmentConfiguration) {
        this.environmentConfiguration = _environmentConfiguration;
    }

    @Bean
    public DataSource createDataSource(){

        System.out.println(environmentConfiguration.getDrivername());
        System.out.println(environmentConfiguration.getMysql_userName());
        System.out.println(environmentConfiguration.getPassword());
        System.out.println(environmentConfiguration.getUrl());
        dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environmentConfiguration.getDrivername());
        dataSourceBuilder.url(environmentConfiguration.getUrl());
        dataSourceBuilder.username(environmentConfiguration.getMysql_userName());
        dataSourceBuilder.password(environmentConfiguration.getPassword());
        return dataSourceBuilder.build();
    }



}
