package com.State;

public class Car {
    private State state;

    public Car(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}