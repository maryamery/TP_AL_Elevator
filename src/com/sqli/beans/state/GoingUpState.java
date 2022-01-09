package com.sqli.beans.state;

import com.sqli.beans.Building;
import com.sqli.beans.Elevator;

public class GoingUpState extends State {
	
    public GoingUpState(Elevator elevator) {
        super(elevator);
        
    }

    @Override
    public int calculDistance(int requestfloor, int actualPosition,int numberofloors) {
    	if((requestfloor-actualPosition) >= 0)
    		return requestfloor-actualPosition;
    	else
        return 2*(numberofloors - actualPosition)+(actualPosition-requestfloor);
    }

    @Override
    public void moving_down() {
        this.elevator.setState(new GoingDownState(this.elevator));
    }

    @Override
    public void moving_up() {
        throw new IllegalStateException("already moving up");
    }

    @Override
    public void resting(){
        this.elevator.setState(new RestingState(this.elevator));
    }
}
