package com.company;

public class HovLane {
    private Car head;
    private HovLane next;

    public HovLane(Car car) {
        head = car;
        next = null;
    }

    public HovLane() {
        head = new Car();
        next = null;
    }

    public HovLane(int size){
        head = new Car();
        next = new HovLane();
        for (int i = 0; i < size - 2; i++) {
            next = next.prepend(new Car());//new HovLane(new Car());
        }
    }

    public HovLane createHOVspecificSize(int size){
        HovLane result = new HovLane();
        for (int i = 0; i < size - 1; i++) {
            result = result.prepend(new Car());
        }
        return result;
    }

    public HovLane prepend(Car car){
        HovLane temp = new HovLane(car);
        temp.next = this;
        return temp;
    }


    @Override
    public String toString() {
        return head + " -> " + next;
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
}
