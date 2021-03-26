package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.fieldsAndCrops.Field;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FeildTest {
    Field field = new Field();

    @Test
    public void twoTractorsInTheField() {
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        field.addVehicles(tractor1);
        field.addVehicles(tractor2);

        Assert.assertEquals(field.getVehicles(),2);
    }

    @Test
    public void planeInTheField() {
        CropDuster duster = new CropDuster();

        field.addVehicles(duster);

        Assert.assertEquals(field.getVehicles(),3);
    }
}
