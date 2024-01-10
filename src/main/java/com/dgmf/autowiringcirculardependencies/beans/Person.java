package com.dgmf.autowiringcirculardependencies.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";
    // Instead of using @Qualifier Annotation with Constructor
    // Parameter, we can do this also on the top of Class fields:
    // @Qualifier("vehicle2")
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle) {
        System.out.println("Person Bean Created by Spring ...");
        this.vehicle = vehicle;
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
