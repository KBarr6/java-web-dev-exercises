package org.launchcode.java.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItems> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItems> items, Date lastUpdated) {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
    }


}
