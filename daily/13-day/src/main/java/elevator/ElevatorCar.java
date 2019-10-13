package elevator;

import static elevator.Constants.defaultFloor;

public class ElevatorCar {
    private int currentFloor;
    private boolean doorClosed;
    private CarDirection direction;

    public ElevatorCar() {
        this.currentFloor= defaultFloor;
        this.direction= CarDirection.STANDING;
        this.doorClosed=true;
    }

    void goToFloor(int elevatorRequestOnFloor) {
        this.currentFloor=elevatorRequestOnFloor;
        this.doorClosed=false;
    }


    public int getCurrentFloor() {
        return currentFloor;
    }
}
