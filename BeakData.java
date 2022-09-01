package com.example.birdmodelcreation;

public class BeakData {

    public String BeakDescription;
    public Integer BeakImage;

    public BeakData(String beakDescription, Integer beakImage) {
        this.BeakDescription = beakDescription;
        this.BeakImage = beakImage;
    }

    public String getBeakDescription() {
        return BeakDescription;
    }

    public void setBeakDescription(String beakDescription) {
        this.BeakDescription = beakDescription;
    }

    public Integer getBeakImage() {
        return BeakImage;
    }

    public void setBeakImage(Integer beakImage) {
        this.BeakImage = beakImage;
    }
}
