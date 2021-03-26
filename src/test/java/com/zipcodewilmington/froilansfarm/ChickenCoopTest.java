package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ChickenCoopTest {
    @Test
    public void chickenCoopTest() {
        ChickenCoop chickenCoop = new ChickenCoop();

        chickenCoop.addChickens(new Chicken());

        int numberOfChickens = chickenCoop.getChickens();

        Assert.assertEquals(numberOfChickens, 1);
    }

    @Test
    public void chickenCoopTest2() {
        ChickenCoop chickenCoop = new ChickenCoop();

        chickenCoop.addChickens(new Chicken());

        int numberOfChickens = chickenCoop.getChickens();

        Assert.assertEquals(numberOfChickens, 1);
    }

    @Test
    public void chickenCoopTest3() {
        ChickenCoop chickenCoop = new ChickenCoop();

        chickenCoop.addChickens(new Chicken());

        int numberOfChickens = chickenCoop.getChickens();

        Assert.assertEquals(numberOfChickens, 1);
    }

    @Test
    public void chickenCoopTest4() {
        ChickenCoop chickenCoop = new ChickenCoop();

        chickenCoop.addChickens(new Chicken());

        int numberOfChickens = chickenCoop.getChickens();

        Assert.assertEquals(numberOfChickens, 1);
    }




}