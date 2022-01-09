package com.sqli.beans.state;

import com.sqli.beans.Elevator;

public  abstract class State {

    protected Elevator elevator;
    int numberofloors=0;

    public State(Elevator elevator) {
        this.elevator = elevator;
    }

    //public abstract  int calculDistance(int requestfloor, int actualPosition);
    public abstract  int calculDistance(int requestfloor, int actualPosition,int numberofloors);
    public abstract void moving_down() ;
    public abstract void moving_up() ;
    public abstract void resting() ;
}
