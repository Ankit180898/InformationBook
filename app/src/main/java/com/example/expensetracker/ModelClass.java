package com.example.expensetracker;

public class ModelClass {
    private String image;
    private String category;

    public ModelClass(String image, String category) {
        this.image = image;
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }
}
