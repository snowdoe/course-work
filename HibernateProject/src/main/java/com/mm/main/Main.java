package com.mm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by machu on 2017-06-10.
 */
@Configuration
@EntityScan("com.mm.entity")
@EnableJpaRepositories("com.mm.dao")
@ComponentScan({"com.mm.service","com.mm.controller"})
@EnableAutoConfiguration
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
