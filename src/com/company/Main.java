package com.company;

public class Main {

    public static void main(String[] args) {

        // Milestone 1
        //Generate an HOV Lane with [X] random cars
        HovLane length10 = new HovLane(10);
        System.out.println("HOV Lane with 10 random cars:\n" + length10);

        // How many cars are in the HOV lane?
        int size = length10.size();
        System.out.println("\nThere are " + size + " cars in the HOV Lane.");

        //TODO What are the ID(s) of cars with only one occupant?





    }
}
