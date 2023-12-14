package com.dgmf.subject4.at.postconstruct.and.at.predestroy.annotations.main;

import com.dgmf.subject4.at.postconstruct.and.at.predestroy.annotations.beans.Vehicle;
import com.dgmf.subject4.at.postconstruct.and.at.predestroy.annotations.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialization of Spring IoC Container and Spring Context and
        // instanciation of the Spring Context
        // ApplicationContext context =
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Fetching the Spring Beans that we want form the Spring Context
        Vehicle vehicle = context.getBean(Vehicle.class);

        // Outputs
        System.out.println("Component Vehicle name from Spring Context is : "
                + vehicle.getName());
        vehicle.printHello();

        // Manual Closing of the Spring Application Context
        context.close();
    }
}
