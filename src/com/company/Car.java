package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Car {
    private int id;
    private int occupancy;
    private String color;

    public Car() {
        Random rand = new Random();
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add("black");
        id = rand.nextInt(1000);
        occupancy = rand.nextInt(7);
        color = colors.get(rand.nextInt(colors.size()));

    }

    @Override
    public String toString() {
        return id + "";
    }
}
