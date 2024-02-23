package com.microservice.orderservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {
    @Bean
    public ModelMapper modelMapperBean(){
        return new ModelMapper();
    }
}
