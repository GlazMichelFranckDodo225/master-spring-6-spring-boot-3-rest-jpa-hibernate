package com.dgmf;

import com.dgmf.nouniquebeandefinitionexception.beans.Vehicle;
import com.dgmf.nouniquebeandefinitionexception.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationNoUniqueBeanDefinitionException {
	public static void main(String[] args) {
		// Initialization of Spring IoC Container and Spring Context and
		// instanciation of the Spring IoC Container
		ApplicationContext context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		// Fetching the Spring Beans that we want form the Spring Context
		// Vehicle vehicle = context.getBean(Vehicle.class);
        /*Vehicle vehicle1 = context.getBean("audiVehicle", Vehicle.class);
        Vehicle vehicle2 = context.getBean("hondaVehicle", Vehicle.class);
        Vehicle vehicle3 = context.getBean("ferrariVehicle", Vehicle.class);*/
		Vehicle vehicle = context.getBean(Vehicle.class);

		// Displaying the names of the retrieved Beans
        /*System.out.println("Vehicle name from Spring Context is : " + vehicle1.getName());
        System.out.println("Vehicle name from Spring Context is : " + vehicle2.getName());
        System.out.println("Vehicle name from Spring Context is : " + vehicle3.getName());*/
		System.out.println("Vehicle name from Spring Context is : " + vehicle.getName());
	}
}
