package elevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElevatorCarTest {

    @Test
    public void should_have_an_elevator_car(){
        ElevatorCar elevatorCar=new ElevatorCar();
        int currentPassengerFloor=0;
        FloorControlPanel.summonElevatorCar(elevatorCar, currentPassengerFloor);
    }
}