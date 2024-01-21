package com.dgmf.autowiringmethodparameter;

import com.dgmf.autowiringmethodparameter.beans.Person;
import com.dgmf.autowiringmethodparameter.beans.Vehicle;
import com.dgmf.autowiringmethodparameter.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAutowiringMethodParameter {
	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		// Retrieving Bean from Spring Context
		Person person = context.getBean(Person.class);
		Vehicle vehicle = context.getBean(Vehicle.class);

		// Outputs
		System.out.println("Person Name from Spring Context is : "
				+ person.getName());
		System.out.println("Vehicle Name from Spring Context is : "
				+ vehicle.getName());
		System.out.println("Vehicle that Person own is : "
				+ person.getVehicle().getName());
	}
}
