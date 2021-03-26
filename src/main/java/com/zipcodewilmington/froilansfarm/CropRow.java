package com.zipcodewilmington.froilansfarm;

import java.util.HashMap;
import java.util.Map;

public class CropRow {

    private Map<Integer, Crop> rows;

    public CropRow(Crop crop) {
        this.rows = new HashMap<Integer, Crop>();
    }

}
