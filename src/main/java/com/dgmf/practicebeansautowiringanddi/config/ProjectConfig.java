package com.dgmf.practicebeansautowiringanddi.config;

import com.dgmf.practicebeansautowiringanddi.beans.Vehicle;
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
@ComponentScan(basePackages = {
        "com.dgmf.practicebeansautowiringanddi.interfaces.impl.speakers",
        "com.dgmf.practicebeansautowiringanddi.interfaces.impl.tyres",
        "com.dgmf.practicebeansautowiringanddi.services"
})
@ComponentScan(basePackageClasses = {
        com.dgmf.practicebeansautowiringanddi.beans.Vehicle.class,
        com.dgmf.practicebeansautowiringanddi.beans.Person.class
})
public class ProjectConfig {
}
