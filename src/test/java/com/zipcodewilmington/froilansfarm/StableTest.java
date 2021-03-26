package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;

import org.junit.Test;

public class StableTest {

    @Test
    public void stableTest() {
        Stable stable1 = new Stable();

        stable1.addHorse(new Horse());

        int numberOfHorses = stable1.getHorses();

        Assert.assertEquals(numberOfHorses, 1);
    }

    @Test
    public void stableTest2() {
        Stable stable2 = new Stable();

        stable2.addHorse(new Horse());
        stable2.addHorse(new Horse());
        stable2.addHorse(new Horse());

        int numberOfHorses = stable2.getHorses();

        Assert.assertEquals(numberOfHorses, 3);
    }

    @Test
    public void stableTest3() {
        Stable stable3 = new Stable();

        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());

        int numberOfHorses = stable3.getHorses();

        Assert.assertEquals(numberOfHorses, 6);
    }

}