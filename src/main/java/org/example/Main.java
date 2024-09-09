package org.example;


public class Main {
    public static void main(String[] args) {
        Car jeep = new Car(4,"blue", 77,"gasoline",
                "audi");
        Car truck = new Car();

        Vehicle van = new Vehicle();

        jeep.displayInfo();

        jeep.setNumberOfWheels(8);
        jeep.setColor("green");
        jeep.setEngineSize(9);
        jeep.setFuelType("diesel");
        jeep.setBrand("BMW");

        jeep.displayInfo();

        truck.displayInfo();

        System.out.println(van.getNumberOfWheels());
        System.out.println(van.getColor());
        System.out.println(van.getEngineSize());
        System.out.println(van.getFuelType());

        System.out.println(truck.getBrand());

        jeep.honk();





    }
}