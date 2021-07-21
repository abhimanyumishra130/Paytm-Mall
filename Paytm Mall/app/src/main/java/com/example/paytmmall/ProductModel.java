package com.example.paytmmall;

public class ProductModel {
    private int img;
    private String text;

    public ProductModel(int img, String text) {
        this.img = img;
        this.text = text;
    }

    public int getImg() {
        return img;
    }

    public String getText() {
        return text;
    }
}
