package elevator;

public class FloorControlPanel  {

    public static void summonElevatorCar(ElevatorCar elevatorCar, int elevatorRequestOnFloor) {
    ElevatorController.requestElevator(elevatorCar, elevatorRequestOnFloor);
    }


}
