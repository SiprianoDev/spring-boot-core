package com.study.sipriano;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de vendas";
    }

    @Bean(name = "applicationName2")
    public String applicationName2(){
        return "Sistema de vendas2";
    }
}
