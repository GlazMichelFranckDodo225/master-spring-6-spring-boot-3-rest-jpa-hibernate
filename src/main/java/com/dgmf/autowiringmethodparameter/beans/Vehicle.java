package com.dgmf.autowiringmethodparameter.beans;

public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle Bean Created by Spring ...");
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean ...");
    }

    @Override
    public String toString() {
        return "Vehicle Name is : " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
