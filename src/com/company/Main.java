package com.company;

public class Main {

    public static void main(String[] args) {

        // Milestone 1
        Car randomCar = new Car();
        System.out.println("Car 1: " + randomCar);
        Car car2 = new Car();
        System.out.println("Car 2: " + car2);
        Car car3 = new Car();
        System.out.println("Car 3: " + car3);





        HovLane lane = new HovLane(randomCar);
        System.out.println("\n" + lane);
        HovLane newLane = lane.prepend(car2);
        System.out.println(newLane);
        HovLane lane3 = newLane.prepend(car3);
        System.out.println(lane3);

        //HovLane length10method = lane.createHOVspecificSize(10);
        HovLane length10 = new HovLane(10);
        System.out.println("\n" + length10);





    }
}
