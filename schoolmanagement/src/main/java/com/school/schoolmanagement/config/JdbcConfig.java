package com.school.schoolmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@PropertySource("classpath:application.properties")
public class JdbcConfig {
//
//    @Autowired
//    Environment environment;
//
////    private final String URL = "url";
////    private final String USER = "dbuser";
////    private final String DRIVER = "driver";
////    private final String PASSWORD = "dbpassword";

    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5433/schooldb");
        driverManagerDataSource.setUsername("vamsipanchada");
        driverManagerDataSource.setPassword("sys123");
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        return driverManagerDataSource;
    }

}
