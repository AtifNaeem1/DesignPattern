package com.State;

public class StartState implements State {

    public void doAction() {
        System.out.println("Car is in start state");
    }

    public String toString(){
        return "Start State";
    }
}