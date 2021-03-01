package com.kazigulov.berdibek.alippe;

public class Model {

    private int image;
    private String text;







    public Model(int image,String text) {
        this.image = image;
        this.text = text;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public int getImage()   {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
