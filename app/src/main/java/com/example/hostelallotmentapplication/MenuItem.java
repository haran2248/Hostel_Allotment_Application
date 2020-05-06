package com.example.hostelallotmentapplication;

public class MenuItem {
    //fields
    private String name;
    private String side;

    //constructor

    public MenuItem(String name, String side) {
        this.name = name;
        this.side = side;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSide() { return side; }

    public void setSide(String side) { this.side = side; }
}
