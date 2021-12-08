package com.study.sipriano;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//Container IOC
public class MyConfiguration {

    @Bean(name = "applicationName")//Container IOC, o único que é em método
    public String appName(){
        return "Sistema de vendas";
    }

    @Bean(name = "applicationName2")
    public String applicationName2(){
        return "Sistema de vendas 2";
    }
}
