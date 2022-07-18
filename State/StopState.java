package com.State;

public class StopState implements State {

    public void doAction() {
        System.out.println("Car is in stop state");

    }

    public String toString(){
        return "Stop State";
    }
}