package com.zipcodewilmington.froilansfarm;

<<<<<<< HEAD
import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;
=======
>>>>>>> 4ea2109f4e5912e540e60d0313fc43c115f68d88
import org.junit.Test;

import static org.junit.Assert.*;

public class StableTest {

    @Test
    public void stableTest() {
        Stable stable = new Stable();

        stable.addHorse(new Horse());

        int numberOfHorses = stable.getHorses();

        Assert.assertEquals(numberOfHorses, 1);
    }

}