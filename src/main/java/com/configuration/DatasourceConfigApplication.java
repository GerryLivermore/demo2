package com.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Created by Administrator on 2019\9\4 0004.
 * 没有配置成功 nested exception is java.lang.IllegalArgumentException: Cannot find class [com.zaxxer.hikari.HikariDataSource]

 */
@SpringBootApplication
public class DatasourceConfigApplication implements CommandLineRunner {
    @Autowired
    private DataSource datasource;

    @Override
    public void run(String... args) throws Exception {
        try(Connection conn = datasource.getConnection()){
            System.out.println(conn);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(DatasourceConfigApplication.class, args);
    }
}
