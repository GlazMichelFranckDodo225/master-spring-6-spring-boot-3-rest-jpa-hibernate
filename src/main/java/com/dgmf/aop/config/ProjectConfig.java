package com.dgmf.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

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
        "com.dgmf.aop.interfaces.impl",
        "com.dgmf.aop.aspects",
        "com.dgmf.aop.services"
})
// To Enable Spring AOP Features inside the Application
@EnableAspectJAutoProxy
public class ProjectConfig {
}
