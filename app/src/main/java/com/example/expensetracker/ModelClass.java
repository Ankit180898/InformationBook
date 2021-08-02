package com.example.expensetracker;

public class ModelClass {
    private int image;
    private String category;
    private String Description ;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ModelClass(int image, String category,String Description) {
        this.image = image;
        this.category = category;
        this.Description=Description;
    }

    public int getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }
}
