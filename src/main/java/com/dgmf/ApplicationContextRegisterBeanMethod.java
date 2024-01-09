package com.dgmf;

import com.dgmf.context.registerBean.method.beans.Vehicle;
import com.dgmf.context.registerBean.method.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class ApplicationContextRegisterBeanMethod {
	public static void main(String[] args) {
		// Initialization of Spring IoC Container and Spring Context and
		// instantiation of the Spring Context
		// ApplicationContext context =
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		// Lambda Supplier Functional Interface Implementations
		// Supplier Functional Interface 1
		Vehicle volkswagen = new Vehicle();
		volkswagen.setName("Volkswagen");
		Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

		// Supplier Functional Interface 2
		Supplier<Vehicle> audiSupplier = () -> {
			Vehicle audi = new Vehicle();
			audi.setName("Audi");

			return audi;
		};

		// A Random Integer from 1 to 10
		Random random = new Random();
		int randomNumber = random.nextInt(10);
		System.out.println("Random Number is : " + randomNumber);

		// Registering Bean Randomly depending on whether we
		// have an Even or Odd Number
		if((randomNumber % 2) == 0) {
			context.registerBean(
					"volkswaggen",
					Vehicle.class,
					volkswagenSupplier
			);
		} else {
			context.registerBean(
					"audi",
					Vehicle.class,
					audiSupplier
			);
		}

		// Retrieving the Registered Bean
		Vehicle volksVehicle = null;
		Vehicle audiVehicle = null;

		try {
			volksVehicle = context.getBean("volkswaggen", Vehicle.class);
		} catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
			System.out.println("Error while creating Volkswagen Vehicle");
		}

		try {
			audiVehicle = context.getBean("audi", Vehicle.class);
		} catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
			System.out.println("Error while creating Audi Vehicle");
		}

		// Displaying the Retrieved Bean
		if(volksVehicle != null) {
			// Output
			System.out.println("Programming Vehicle Name from Spring Context is : "
					+ volksVehicle.getName());
		} else {
			// Output
			System.out.println("Programming Vehicle Name from Spring Context is : "
					+ audiVehicle.getName());
		}
	}
}
