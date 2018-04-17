package com.company;

public class HovLane {
    private Car head;
    private HovLane next;

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
        HovLane temp = new HovLane(car);
        temp.next = this;
        return temp;
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


}
