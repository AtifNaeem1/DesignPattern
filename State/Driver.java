package com.State;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car();

        car.setState(new StartState());
        car.getState().doAction();

        System.out.println(car.getState().toString());

        car.setState(new StopState());
        car.getState().doAction();

        System.out.println(car.getState().toString());
    }
}