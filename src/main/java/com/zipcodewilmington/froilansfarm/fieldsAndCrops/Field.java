package com.zipcodewilmington.froilansfarm.fieldsAndCrops;

import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Field {

    List<FarmVehicle> vehicles = new ArrayList<FarmVehicle>();

    public Field() {

    }

    public int getVehicles() {
        return vehicles.size();
    }

    public void addVehicles(FarmVehicle vehicles) {
        this.vehicles.add(vehicles);


    }
}
