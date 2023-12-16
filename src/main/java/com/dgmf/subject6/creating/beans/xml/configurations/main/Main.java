package com.dgmf.subject6.creating.beans.xml.configurations.main;

import com.dgmf.subject6.creating.beans.xml.configurations.beans.Vehicule;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialization of Spring IoC Container and Spring Context
        var context = new ClassPathXmlApplicationContext("beans.xml");

        // Fetching the Spring Beans that we want
        Vehicule vehicule = context.getBean(Vehicule.class);

        // Outputs
        System.out.println("Vehicule name from the Spring Context is : "
                + vehicule.getName());
        vehicule.vehicleMethod();
    }
}
