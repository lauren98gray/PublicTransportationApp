package com.company;

import java.util.ArrayList;

public class HovLane {
    private Car head;
    private HovLane next;
    public int maxCars = 10;

    private HovLane(Car car) {
        head = car;
        next = null;
    }

    private HovLane() {
        head = new Car();
        next = null;
    }

    public HovLane(int size){
        head = new Car();
        next = new HovLane();
        for (int i = 0; i < size - 1; i++) {
            next = next.prepend(new Car());
        }
    }

    @Override
    public boolean equals(Object obj) {
        HovLane lane = (HovLane) obj;
        if (this.head.equals(lane.head) &&
            this.next.equals(lane.next)){
            return true;
        }
        return false;
    }

    public int size() {
        int count = 0;
        HovLane temp = this;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    public HovLane prepend(Car car){
        if (this.size() < maxCars) {
            HovLane temp = new HovLane(car);
            temp.next = this;
            return temp;
        }
        HovLane newLane = new HovLane(car);
        return newLane;
    }


    @Override
    public String toString() {
        return "head:" + head + " -> next:" + next;
    }

    public Car getCar() {
        return head;
    }

    public HovLane getNext() {
        return next;
    }

    public void setCar(Car car) {
        this.head = car;
    }

    public void setNext(HovLane next) {
        this.next = next;
    }


    public ArrayList<Integer> numOccupantIDs(int numOccupants) {
        HovLane temp = this;
        ArrayList<Integer> result = new ArrayList<>();
        while (temp.next != null){
            if (temp.head.getOccupancy() == numOccupants){
                result.add(temp.head.getId());
            }
            temp = temp.next;
        }
        return result;
    }

    public int colorCount(String color) {
        int count = 0;
        HovLane temp = this;
        while (temp.next != null){
            if (temp.head.getColor().equals(color)){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
}
