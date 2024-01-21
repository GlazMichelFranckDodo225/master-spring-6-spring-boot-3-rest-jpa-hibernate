package com.dgmf.autowiringcirculardependencies;

import com.dgmf.autowiringcirculardependencies.beans.Person;
import com.dgmf.autowiringcirculardependencies.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAutowiringCircularDependencies {
	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		// Retrieving Bean from Spring Context
		Person person = context.getBean(Person.class);

		// Outputs
		System.out.println("Person Name from Spring Context is : "
				+ person.getName());
		System.out.println("Vehicle that Person own is : "
				+ person.getVehicle().getName());
	}
}
