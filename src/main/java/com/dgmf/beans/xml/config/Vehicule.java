package com.dgmf.beans.xml.config;

public class Vehicule {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void vehicleMethod() {
        System.out.println("I am a Bean of Type Vehicle");
    }
}
