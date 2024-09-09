package org.example;

public class Vehicle {
    private int numberOfWheels=0;
    private String color="null";
    private float engineSize=0;
    private String fuelType="null";

    public Vehicle(){} //constructor

    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }
    public int getNumberOfWheels() { //get the number of wheels
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) { //set the number of wheels
        this.numberOfWheels = numberOfWheels;
    }
    public String getColor() { //get the color of vehicle
        return color;
    }
    public void setColor(String color) { //store the color of the vehicle
        this.color = color;
    }
    public float getEngineSize() { //get the engine size of the vehicle
        return engineSize;
    }
    public void setEngineSize(float engineSize) { //set the engine size of the vehicle
        this.engineSize = engineSize;
    }
    public String getFuelType() { //get the fuel type of the vehicle
        return fuelType;
    }
    public void setFuelType(String fuelType) { //set the fuel type of vehicle
        this.fuelType = fuelType;
    }



}
