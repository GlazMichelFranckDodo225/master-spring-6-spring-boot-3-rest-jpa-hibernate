package com.dgmf.autowiringtypesandsteps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle1) {
        System.out.println("Person Bean Created by Spring ...");
        this.vehicle = vehicle1;
    }

    @Override
    public String toString() {
        return "Person Name is : " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
