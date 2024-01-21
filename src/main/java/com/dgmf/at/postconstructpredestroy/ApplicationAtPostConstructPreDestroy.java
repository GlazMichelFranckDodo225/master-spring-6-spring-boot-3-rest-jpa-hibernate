package com.dgmf.at.postconstructpredestroy;

import com.dgmf.at.postconstructpredestroy.beans.Vehicle;
import com.dgmf.at.postconstructpredestroy.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAtPostConstructPreDestroy {
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
