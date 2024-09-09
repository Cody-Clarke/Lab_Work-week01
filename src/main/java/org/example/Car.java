package org.example;

public class Car extends Vehicle {
    private String brand= "Null";

    public Car() {} //constructor

    public Car(int numberOfWheels, String color, float engineSize, String fuelType,String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    @Override
    public int getNumberOfWheels() { //get the number of wheels
        return super.getNumberOfWheels();
    }

    @Override
    public void setNumberOfWheels(int numberOfWheels) { //set the number of wheels
        super.setNumberOfWheels(numberOfWheels);
    }

    @Override
    public float getEngineSize() { //get the engine size
        return super.getEngineSize();
    }

    @Override
    public void setEngineSize(float engineSize) { //set the engine size
        super.setEngineSize(engineSize);
    }

    @Override
    public String getColor() { //get the color of car
        return super.getColor();
    }

    @Override
    public void setColor(String color) { //store the color of the car
        super.setColor(color);
    }

    @Override
    public String getFuelType() { //get the fuel type of the car
        return super.getFuelType();
    }

    @Override
    public void setFuelType(String fuelType) { //set the fuel type of the car
        super.setFuelType(fuelType);
    }

    public String getBrand() { //get the brand of the car
        return brand;
    }

    public void setBrand(String brand) { //get the brand of the car
        this.brand = brand;
    }

    public void honk() {
         System.out.print("Honk,Honk!");
    }
    public void displayInfo(){
        System.out.print("Number of wheels: "+ getNumberOfWheels()+"\nColor of car:" + getColor()+
                "\nThe engine size: "+ getEngineSize()+ "\nFuel type: "+ getFuelType()+ "\nBrand: " + brand +" \n");
    }

}
