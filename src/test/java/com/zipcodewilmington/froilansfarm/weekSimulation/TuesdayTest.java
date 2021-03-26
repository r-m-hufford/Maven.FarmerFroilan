package com.zipcodewilmington.froilansfarm.weekSimulation;

import com.zipcodewilmington.froilansfarm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.CornStalk;
import com.zipcodewilmington.froilansfarm.Stable;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.edible.Vegetable;
import com.zipcodewilmington.froilansfarm.fieldsAndCrops.Crop;
import com.zipcodewilmington.froilansfarm.fieldsAndCrops.CropRow;
import com.zipcodewilmington.froilansfarm.fieldsAndCrops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.humans.Farmer;
import com.zipcodewilmington.froilansfarm.humans.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Test;

public class TuesdayTest {

    @Test
    public void testTuesday(){
        // Given
        String name1 = "Froilan";
        Farmer farmer = new Farmer(name1);

        String name2 = "Froilanda";
        Pilot pilot = new Pilot(name2);

        CropRow cropRows = new CropRow();
        cropRows.setOneRow(1, new CornStalk());
        cropRows.setOneRow(2, new TomatoPlant());
        cropRows.setOneRow(3, new Crop());
        cropRows.setOneRow(4, new Crop());
        cropRows.setOneRow(5, new Crop());

        ChickenCoop chickenCoop1 = new ChickenCoop();
        for(int i = 0; i < 4; i++) {
            chickenCoop1.addChickens(new Chicken());
        }
        ChickenCoop chickenCoop2 = new ChickenCoop();
        for(int i = 0; i < 4; i++) {
            chickenCoop2.addChickens(new Chicken());
        }
        ChickenCoop chickenCoop3 = new ChickenCoop();
        for(int i = 0; i < 4; i++) {
            chickenCoop3.addChickens(new Chicken());
        }
        ChickenCoop chickenCoop4 = new ChickenCoop();
        for(int i = 0; i < 3; i++) {
            chickenCoop4.addChickens(new Chicken());
        }

        Stable stable1 = new Stable();
        for(int i = 0; i < 4; i++){
            stable1.addHorse(new Horse());
        }
        Stable stable2 = new Stable();
        for(int i = 0; i < 3; i++){
            stable2.addHorse(new Horse());
        }
        Stable stable3 = new Stable();
        for(int i = 0; i < 3; i++){
            stable3.addHorse(new Horse());
        }

        FarmVehicle tractor1 = new Tractor();
        FarmVehicle tractor2 = new Tractor();
        FarmVehicle cropDuster = new CropDuster();

        //When
        for(int i = 0; i < 4; i++) {
            farmer.mount(stable1.getHorse(i));
            farmer.dismount(stable1.getHorse(i));
            for(int j = 0; j < 3; j++){
                stable1.getHorse(i).eat(new EarCorn());
            }
        }

        for(int i = 0; i < 3; i++) {
            pilot.mount(stable2.getHorse(i));
            pilot.dismount(stable2.getHorse(i));
            for(int j = 0; j < 3; j++){
                stable1.getHorse(i).eat(new EarCorn());
            }
        }

        for(int i = 0; i < 3; i++) {
            pilot.mount(stable3.getHorse(i));
            pilot.dismount(stable3.getHorse(i));
            for(int j = 0; j < 3; j++){
                stable1.getHorse(i).eat(new EarCorn());
            }
        }

        farmer.eat(new EarCorn());
        farmer.eat(new Tomato());
        farmer.eat(new Tomato());
        for(int i = 0; i < 5; i++){
            farmer.eat(new Egg());
        }

        pilot.eat(new EarCorn());
        pilot.eat(new EarCorn());
        pilot.eat(new Tomato());
        pilot.eat(new Egg());
        pilot.eat(new Egg());

        //Froilan needs to harvest every crop row with his tractor

    }

}
