package com.dgmf.aop;

import com.dgmf.beans.Person;
import com.dgmf.beans.Vehicle;
import com.dgmf.config.ProjectConfig;
import com.dgmf.services.VehicleServices;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationSpringAop {

	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		// Retrieving Bean from Spring Context
		VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
		VehicleServices vehicleServices2 = context.getBean(
				"vehicleServices",
				VehicleServices.class
		);

		// Outputs
		System.out.println("Hashcode of the Bean vehicleServices1 : " +
				vehicleServices1.hashCode());
		System.out.println("Hashcode of the Bean vehicleServices2 : " +
				vehicleServices2.hashCode());

		if(vehicleServices1 == vehicleServices2) {
			System.out.println("VehicleServices Bean is a Singleton Scope Bean");
		} else {
			System.out.println("VehicleServices Bean is a Prototype Scope Bean");

		}
	}

}
