package com.dgmf.subject3.at.component.annotation.main;

import com.dgmf.subject3.at.component.annotation.beans.Vehicle;
import com.dgmf.subject3.at.component.annotation.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialization of Spring IoC Container and Spring Context and
        // instanciation of the Spring Context
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Fetching the Spring Beans that we want form the Spring Context
        Vehicle vehicle = context.getBean(Vehicle.class);

        // Outputs
        System.out.println("Vehicle name from Spring Context is : " + vehicle.getName());
        vehicle.printHello();
    }
}
