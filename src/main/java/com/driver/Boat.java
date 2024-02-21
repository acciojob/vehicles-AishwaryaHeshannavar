package com.driver;

public class Boat implements WaterVehicle {
    String name="marcidies";
    int capacity=200;

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
