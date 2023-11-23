package com.dgmf.abeanannotation.config;

import com.dgmf.abeanannotation.beans.Vehicule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
Spring "@Configuration" Annotation is part of the Spring Core
Framework. "@Configuration" Annotation indicates that the Class
has "@Bean" definition Methods. So Spring IoC container can
process the Class and generate Spring Beans to be used in the
Application.
* */
// At the startup or during the initialization of
// the Spring IoC container, Spring IoC Container will scan all
// the content of this class because of "@Configuration" Annotation
@Configuration
public class ProjectConfig {
    /*
    "@Bean" Annotation lets Spring IoC Container know that it
    needs to call the annotated Method when it initialized its
    Context and adds the returned value to the Context
    * */
    @Bean
    public Vehicule vehicule() {
        var vehicule = new Vehicule();
        vehicule.setName("Audi 8");

        return vehicule;
    }

    @Bean
    public String hello() {
        return "Hello world !";
    }

    @Bean
    public Integer number() {
        return 16;
    }
}