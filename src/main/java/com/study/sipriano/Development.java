package com.study.sipriano;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//o alvo é só classe
@Retention(RetentionPolicy.RUNTIME)//em tempo de execução
@Configuration
@Profile("development")//usando o profile de development, altere aqui e todos os lugare q tiver usando sera alterado
public @interface Development {//esse é o nome da anntation
}
