package com.dgmf.beans.xml.config;

import com.dgmf.beans.xml.config.Vehicule;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationBeansXmlConfig {
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
