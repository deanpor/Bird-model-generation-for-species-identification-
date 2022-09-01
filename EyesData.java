package com.example.birdmodelcreation;

public class EyesData {

    public String EyesDescription;
    public Integer EyesImage;

    public EyesData(String eyesDescription, Integer eyesImage) {
        EyesDescription = eyesDescription;
        EyesImage = eyesImage;
    }


    public String getEyesDescription() {
        return EyesDescription;
    }

    public void setEyesDescription(String eyesDescription) {
        EyesDescription = eyesDescription;
    }

    public Integer getEyesImage() {
        return EyesImage;
    }

    public void setEyesImage(Integer eyesImage) {
        EyesImage = eyesImage;
    }
}
