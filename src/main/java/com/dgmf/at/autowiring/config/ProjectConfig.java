package com.dgmf.at.autowiring.config;

import com.dgmf.at.autowiring.beans.Person;
import com.dgmf.at.autowiring.beans.Vehicle;
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
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");

        return vehicle;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle());

        return person;
    }
}
