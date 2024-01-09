package com.dgmf.at.autowiredconstructor.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";
    private Vehicle vehicle;

    @Autowired // Optional because of only one Constructor
    public Person(Vehicle vehicle) {
        System.out.println("Person Bean Created by Spring ...");
        this.vehicle = vehicle;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Person Bean ...");
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
