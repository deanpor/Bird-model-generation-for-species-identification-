package com.example.birdmodelcreation;

public class HeadData {

    public String HeadDescription;
    public Integer HeadImage;

    public HeadData(String headDescription, Integer headImage) {
        HeadDescription = headDescription;
        HeadImage = headImage;
    }

    public String getHeadDescription() {
        return HeadDescription;
    }

    public void setHeadDescription(String headDescription) {
        HeadDescription = headDescription;
    }

    public Integer getHeadImage() {
        return HeadImage;
    }

    public void setHeadImage(Integer headImage) {
        HeadImage = headImage;
    }
}
