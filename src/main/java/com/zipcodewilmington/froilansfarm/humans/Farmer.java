package com.zipcodewilmington.froilansfarm.humans;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.edible.Edible;


public class Farmer extends Person implements Botanist, Rider{
    private String name;



    public Farmer (String name) {
        this.name = name;

    }
    public void plantCrop() {

    }

    public void eat(Edible edible) {

    }

    public String makeNoise() {
        return null;
    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }




}
