package com.example.paytmmall.Product_Recycler;

public class ProductRecyclerModel {

    private int imgId;
    private String prodName;
    private int amount;
    private int amountCut;

    public ProductRecyclerModel(int imgId, String prodName, int amountCut, int amount) {
        this.imgId = imgId;
        this.prodName = prodName;
        this.amount = amount;
        this.amountCut = amountCut;

    }

    public int getImgId() {
        return imgId;
    }

    public String getProdName() {
        return prodName;
    }

    public int getAmount() {
        return amountCut;
    }

    public int getAmountCut() {
        return amount;
    }
}
