package com.example.birdmodelcreation;

public class NeckData {

    public String NeckDescription;
    public Integer NeckImage;

    public NeckData(String neckDescription, Integer neckImage) {
        NeckDescription = neckDescription;
        NeckImage = neckImage;
    }

    public String getNeckDescription() {
        return NeckDescription;
    }

    public void setNeckDescription(String neckDescription) {
        NeckDescription = neckDescription;
    }

    public Integer getNeckImage() {
        return NeckImage;
    }

    public void setNeckImage(Integer neckImage) {
        NeckImage = neckImage;
    }
}
