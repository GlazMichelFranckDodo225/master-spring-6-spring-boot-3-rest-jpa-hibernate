package com.dgmf.autowiringtypesandsteps;

import com.dgmf.autowiringtypesandsteps.beans.Person;
import com.dgmf.autowiringtypesandsteps.beans.Vehicle;
import com.dgmf.autowiringtypesandsteps.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAutowiringTypesAndSteps {
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
