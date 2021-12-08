package com.study.sipriano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(//scaneia todos os pacotes a partir de onde tiver o @ComponentScan, use se for um pacote fora do escopo
        basePackages = {
                "com.study.sipriano.repository",
                "com.study.sipriano.service;",
                "com.externa.outralib"}//nessa seria necessário usar
)
@RestController
public class VendasApplication {
    @Autowired//Injeção de dependência, formando uma inversão de controle
    @Qualifier("applicationName")//usando o Bean
    private String appName;

    @GetMapping("/hello")
    public String helloWorld(){
        return appName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

    
}
