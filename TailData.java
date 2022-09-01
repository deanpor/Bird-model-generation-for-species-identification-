package com.example.birdmodelcreation;

public class TailData {

    public String TailDescription;
    public Integer TailImage;

    public TailData(String tailDescription, Integer tailImage) {
        TailDescription = tailDescription;
        TailImage = tailImage;
    }

    public String getTailDescription() {
        return TailDescription;
    }

    public void setTailDescription(String tailDescription) {
        TailDescription = tailDescription;
    }

    public Integer getTailImage() {
        return TailImage;
    }

    public void setTailImage(Integer tailImage) {
        TailImage = tailImage;
    }
}
