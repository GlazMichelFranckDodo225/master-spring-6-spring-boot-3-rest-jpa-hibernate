package com.dgmf.bnouniquebeandefinitionexception.main;

import com.dgmf.bnouniquebeandefinitionexception.beans.Vehicle;
import com.dgmf.bnouniquebeandefinitionexception.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        // Initialization of Spring IoC Container and Spring Context
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Fetching the Spring Beans that we want
        // Vehicle vehicle = context.getBean(Vehicle.class);
        Vehicle vehicle = context.getBean("vehicle1", Vehicle.class);

        // Displaying the name of the retrieved Bean
        System.out.println("Vehicle name from Spring Context is : " + vehicle.getName());
    }
}
