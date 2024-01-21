package com.dgmf.practicebeansautowiringanddi;

import com.dgmf.practicebeansautowiringanddi.config.ProjectConfig;
import com.dgmf.practicebeansautowiringanddi.beans.Person;
import com.dgmf.practicebeansautowiringanddi.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationPracticeBeansAutowiringAndDI {
	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		// Retrieving Bean from Spring Context
		String[] persons = context.getBeanNamesForType(Person.class);
		Person person = context.getBean(Person.class);
		String[] vehicles = context.getBeanNamesForType(Vehicle.class);
		Vehicle vehicle = context.getBean(Vehicle.class);

		// Outputs
		// Type Person
		for(String foundPerson: persons) {
			System.out.println(foundPerson);
		}
		System.out.println(person.getName());

		// Type Vehicle
		for(String foundVehicle: vehicles) {
			System.out.println(foundVehicle);
		}
		System.out.println(vehicle.getName());

		// Using Vehicle Services
		vehicle.getVehicleServices().playMusic();
		vehicle.getVehicleServices().moveVehicle();
		person.getVehicle().getVehicleServices().playMusic();
		person.getVehicle().getVehicleServices().moveVehicle();
	}
}
