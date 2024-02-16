package com.example.projectleboncoin_amse;

public class AdModel {
    private String title;
    private String address;
    private int image;

    public AdModel(String title, String address, int image) {
        this.title = title;
        this.address = address;
        this.image = image;
    }

    // Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
