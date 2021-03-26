package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    List<Chicken> chickens = new ArrayList<Chicken>();



    public ChickenCoop(Chicken ...chickens){
        for(Chicken chicken : chickens){
            this.chickens.add(chicken);
        }
    }

    public Integer getChickens() {
        return chickens.size();
    }

    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public void addChickens(Chicken chickens) {
        this.chickens.add(chickens);
    }
}
