package com.dgmf.aop.services;

import com.dgmf.aop.entity.Song;
import com.dgmf.aop.interfaces.Speakers;
import com.dgmf.aop.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleServices {
    private Logger logger =
            Logger.getLogger(VehicleServices.class.getName());
    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public String playMusic(boolean vehicleStarted, Song song) {
        /*Instant start = Instant.now();
        logger.info("Method Execution Start");
        String music = null;
        if(vehicleStarted) {
            music = speakers.makeSound(song);
        } else {
            logger.log(
                    Level.SEVERE,
                    "Vehicle Not Started to Perform the Operation"
            );
        }
        logger.info("Method Execution End");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time Took to Execute the Method : " + timeElapsed);

        return music;*/
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
        /*Instant start = Instant.now();
        logger.info("Method Execution Start");*/
        /*String status = null;
        if(vehicleStarted) {
            status = tyres.rotate();
        } else {
            logger.log(
                    Level.SEVERE,
                    "Vehicle Not Started to Perform the Operation"
            );
        }
        logger.info("Method Execution End");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time Took to Execute the Method : " + timeElapsed);

        return status;*/

        return tyres.rotate();
    }

    public String applyBrake(boolean vehicleStarted) {
        /*Instant start = Instant.now();
        logger.info("Method Execution Start");*/
        /*String status = null;
        if(vehicleStarted) {
            status = tyres.stop();
        } else {
            logger.log(
                    Level.SEVERE,
                    "Vehicle Not Started to Perform the Operation"
            );
        }
        logger.info("Method Execution End");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time Took to Execute the Method : " + timeElapsed);

        return status;*/

        return tyres.stop();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
