package com.dgmf.practicebeansautowiringanddi.beans;

import com.dgmf.practicebeansautowiringanddi.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {
    private String name = "Honda";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }
}
