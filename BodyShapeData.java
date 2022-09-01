package com.example.birdmodelcreation;

public class BodyShapeData {

    public String BodyShapeDescription;
    public Integer BodyShapeImage;

    public BodyShapeData(String bodyShapeDescription, Integer bodyShapeImage) {
        BodyShapeDescription = bodyShapeDescription;
        BodyShapeImage = bodyShapeImage;
    }

    public String getBodyShapeDescription() {
        return BodyShapeDescription;
    }

    public void setBodyShapeDescription(String bodyShapeDescription) {
        BodyShapeDescription = bodyShapeDescription;
    }

    public Integer getBodyShapeImage() {
        return BodyShapeImage;
    }

    public void setBodyShapeImage(Integer bodyShapeImage) {
        BodyShapeImage = bodyShapeImage;
    }
}
