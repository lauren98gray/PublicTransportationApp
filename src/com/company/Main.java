package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Milestone 1
        //Generate an HOV Lane with [X] random cars
        HovLane lane = new HovLane(10);
        System.out.println("HOV Lane with 10 random cars:\n" + lane);

        // How many cars are in the HOV lane?
        int size = lane.size();
        System.out.println("\nThere are " + size + " cars in the HOV Lane.");

        //What are the ID(s) of cars with only one occupant?
        ArrayList<Integer> oneOccupantIDs = lane.oneOccupantIDs();
        System.out.println("\nThe ID(s) of the cars with only one occupant are: " + oneOccupantIDs);

        //How many [C] cars are in the HOV lane? [C] is a user-provided car color
        String color = "red";
        int colorCount = lane.colorCount(color);
        System.out.println("\nThere are " + colorCount + " " + color + " cars in the HOV Lane.");





    }
}
