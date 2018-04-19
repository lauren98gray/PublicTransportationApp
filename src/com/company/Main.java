package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // MILESTONE 1

        //Generate an HOV Lane with [X] random cars
        HovLane lane = new HovLane(10);
        System.out.println("HOV Lane with 10 random cars:\n" + lane);

        // How many cars are in the HOV lane?
        int size = lane.size();
        System.out.println("\nThere are " + size + " cars in the HOV Lane.");

        //What are the ID(s) of cars with only one occupant?
        ArrayList<Integer> oneOccupantIDs = lane.numOccupantIDs(1);
        System.out.println("\nThe ID(s) of the cars with only one occupant are: " + oneOccupantIDs);

        //How many [C] cars are in the HOV lane? [C] is a user-provided car color
        String color = "red";
        int colorCount = lane.colorCount(color);
        System.out.println("\nThere are " + colorCount + " " + color + " cars in the HOV Lane.");

        //MILESTONE 2

        //Every time the HOV lane has [N] or more cars, open a second one

        //What was the most number of cars in HOV [H]?
        int maxNumCars = lane.size();
        System.out.println("\nThe most number of cars in HOV [H] is " + maxNumCars);






    }
}
