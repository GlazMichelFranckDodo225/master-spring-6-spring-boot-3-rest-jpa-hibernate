package com.dgmf;

import com.dgmf.at.bean.beans.Vehicule;
import com.dgmf.at.bean.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAtBean {
	public static void main(String[] args) {
		// Initialization of Spring IoC Container and Spring Context
		ApplicationContext context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		// Fetching the Spring Beans that we want
		var vehicule = context.getBean(Vehicule.class);
		String helloBean = context.getBean(String.class);
		Integer numberBean = context.getBean(Integer.class);

		// Outputs
		System.out.println("Vehicule name from the Spring Context is : "
				+ vehicule.getName());
		System.out.println("Hello Bean says : " + helloBean);
		System.out.println("The Value of the Number Bean is : " + numberBean);

	}
}
