package com.dgmf.aop;

import com.dgmf.aop.config.ProjectConfig;
import com.dgmf.aop.entity.Song;
import com.dgmf.aop.services.VehicleServices;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationSpringAop {

	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		var vehicleServices = context.getBean(VehicleServices.class);
		System.out.println(vehicleServices.getClass());

		Song song = new Song();
		song.setTitle("Blank Space");
		song.setSingerName("Taylor Swift");

		//  boolean vehicleStarted = true;
		boolean vehicleStarted = true;
		String moveVehicleStatus =
				vehicleServices.moveVehicle(vehicleStarted);
		String playMusicStatus =
				vehicleServices.playMusic(vehicleStarted, song);
		String applyBrakeStatus =
				vehicleServices.applyBrake(vehicleStarted);
	}

}
