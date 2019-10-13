package elevator;

public class ElevatorController {

    protected static void requestElevator(ElevatorCar elevatorCar, int elevatorRequestOnFloor) {

        elevatorCar.goToFloor(elevatorRequestOnFloor);
    }

}
