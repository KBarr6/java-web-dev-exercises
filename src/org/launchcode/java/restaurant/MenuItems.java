package org.launchcode.java.restaurant;

public class MenuItems {

    private String item;
    private String description;
    private String category;
    private double price;
    private boolean isNew;

    public MenuItems(String item, String description, String category, double price) {
        this.item = item;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
