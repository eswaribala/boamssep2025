package com.boa.userservice.configurations;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableConfigurationProperties(EnvironmentConfiguration.class)
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.boa")
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

        //System.out.println(environmentConfiguration.getDrivername());
        //System.out.println(environmentConfiguration.getMysql_userName());
       // System.out.println(environmentConfiguration.getPassword());
       // System.out.println(environmentConfiguration.getUrl());
        dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environmentConfiguration.getDrivername());
        dataSourceBuilder.url(environmentConfiguration.getUrl());
        dataSourceBuilder.username(environmentConfiguration.getMysql_userName());
        dataSourceBuilder.password(environmentConfiguration.getPassword());
        return dataSourceBuilder.build();
    }
/*

    // When app.active-schema=payment (default)
    @Bean(name = "dataSource")
    @Primary
    @ConditionalOnProperty(name = "app.active-schema", havingValue = "payment", matchIfMissing = true)
    @ConfigurationProperties("app.datasource.payment")
    public DataSource paymentDataSource() {
        return DataSourceBuilder.create().build();
    }

    // When app.active-schema=loan
    @Bean(name = "dataSource")
    @Primary
    @ConditionalOnProperty(name = "app.active-schema", havingValue = "loan")
    @ConfigurationProperties("app.datasource.loan")
    public DataSource loanDataSource() {
        return DataSourceBuilder.create().build();
    }
*/

}
