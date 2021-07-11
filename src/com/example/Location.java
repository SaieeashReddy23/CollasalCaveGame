package com.example;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationId;
    private final String descryption;
    private final Map<String,Integer> exits;

    public Location(int locationId, String descryption) {
        this.locationId = locationId;
        this.descryption = descryption;
        this.exits=new HashMap<>();
        exits.put("Q",0);
    }

    public void addExits(String direction,int location){
        this.exits.put(direction,location);
    }
    public int getLocationId() {
        return locationId;
    }

    public String getDescryption() {
        return descryption;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
