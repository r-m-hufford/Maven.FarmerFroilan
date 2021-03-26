package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Edible;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Botanist, Rider, Pilot{
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
