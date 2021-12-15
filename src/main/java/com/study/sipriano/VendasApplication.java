package com.study.sipriano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Value("${application.name}")//pega o aplication.name do properties correspondente
    private String appName;


    @Cachorro//é só mudar pra gato ou cachorro
    private Animal animal;

    @Bean(name = "executarAnimal") //pra n se confundir com o outro Bean
    public CommandLineRunner executar(){
        return args -> {
          this.animal.fazerBarulho();
        };
    }



    @GetMapping("/hello")
    public String helloWorld(){
        return appName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

    
}
