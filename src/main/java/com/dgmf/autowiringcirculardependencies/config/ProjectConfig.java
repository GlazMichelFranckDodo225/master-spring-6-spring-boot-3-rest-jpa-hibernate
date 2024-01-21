package com.dgmf.autowiringcirculardependencies.config;

import com.dgmf.autowiringcirculardependencies.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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
@ComponentScan(basePackages = "com.dgmf.autowiringcirculardependencies.beans")
public class ProjectConfig {
    /*
    "@Bean" Annotation lets Spring IoC Container know that it
    needs to call the annotated Method when it initialized its
    Context and adds the returned value to the Context
    * */
    @Bean
    public Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi");

        return veh;
    }

    @Bean
    public Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("Honda");

        return veh;
    }

    @Bean
    // @Primary
    public Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("Ferrari");

        return veh;
    }
}
