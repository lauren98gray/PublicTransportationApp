package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Milestone 1
        //Generate an HOV Lane with [X] random cars
        HovLane length10 = new HovLane(10);
        System.out.println("HOV Lane with 10 random cars:\n" + length10);

        // How many cars are in the HOV lane?
        int size = length10.size();
        System.out.println("\nThere are " + size + " cars in the HOV Lane.");

        //What are the ID(s) of cars with only one occupant?
        ArrayList<Integer> oneOccupantIDs = length10.oneOccupantIDs();
        System.out.println("\nThe ID(s) of the cars with only one occupant are: " + oneOccupantIDs);





    }
}
