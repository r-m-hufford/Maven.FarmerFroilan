package com.zipcodewilmington.froilansfarm.FieldsAndCrops;

import com.zipcodewilmington.froilansfarm.FieldsAndCrops.Crop;

import java.util.HashMap;
import java.util.Map;

public class CropRow {

    private Map<Integer, Crop> rows;

    public CropRow(Crop crop) {
        this.rows = new HashMap<Integer, Crop>();
    }

}
