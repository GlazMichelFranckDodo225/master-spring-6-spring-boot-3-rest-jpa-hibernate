package com.dgmf.nouniquebeandefinitionexception.config;

import com.dgmf.nouniquebeandefinitionexception.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    // @Bean
    @Bean(name = "audiVehicle")
    public Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi 8");

        return vehicle;
    }

    // @Bean
    @Bean(value = "hondaVehicle")
    public Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");

        return vehicle;
    }

    // @Bean
    // @Bean("ferrariVehicle")
    @Primary
    @Bean("ferrariVehicle")
    public Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");

        return vehicle;
    }
}
