package com.example.birdmodelcreation;

public class LegData {

    public String LegDescription;
    public Integer LegImage;

    public LegData(String legDescription, Integer legImage) {
        LegDescription = legDescription;
        LegImage = legImage;
    }

    public String getLegDescription() {
        return LegDescription;
    }

    public void setLegDescription(String legDescription) {
        LegDescription = legDescription;
    }

    public Integer getLegImage() {
        return LegImage;
    }

    public void setLegImage(Integer legImage) {
        LegImage = legImage;
    }
}
