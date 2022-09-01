package com.example.birdmodelcreation;

public class WingData {

    public String WingDescription;
    public Integer WingImage;

    public WingData(String wingDescription, Integer wingImage) {
        WingDescription = wingDescription;
        WingImage = wingImage;
    }

    public String getWingDescription() {
        return WingDescription;
    }

    public void setWingDescription(String wingDescription) {
        WingDescription = wingDescription;
    }

    public Integer getWingImage() {
        return WingImage;
    }

    public void setWingImage(Integer wingImage) {
        WingImage = wingImage;
    }
}
