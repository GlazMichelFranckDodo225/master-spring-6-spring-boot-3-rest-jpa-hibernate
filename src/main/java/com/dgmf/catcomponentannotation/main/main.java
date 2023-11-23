package com.dgmf.catcomponentannotation.main;

import com.dgmf.catcomponentannotation.beans.Vehicle;
import com.dgmf.catcomponentannotation.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
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
