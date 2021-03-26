package com.zipcodewilmington.froilansfarm.humans;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.edible.Edible;

<<<<<<< HEAD:src/main/java/com/zipcodewilmington/froilansfarm/humans/Farmer.java
public class Farmer extends Person implements Botanist, Rider, Pilot {
=======
import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Botanist, Rider, Pilot{
    private String name;



    public Farmer (String name) {
        this.name = name;

    }

>>>>>>> 4ea2109f4e5912e540e60d0313fc43c115f68d88:src/main/java/com/zipcodewilmington/froilansfarm/Farmer.java
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
