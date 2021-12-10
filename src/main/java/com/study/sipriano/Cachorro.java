package com.study.sipriano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//o alvo é campo, atributo
@Retention(RetentionPolicy.RUNTIME)//em tempo de execução
@Autowired
@Qualifier("cachorro")
public @interface Cachorro {


}
