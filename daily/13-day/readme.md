# Day 13 Homework

Assuming that we have an elevator that goes from floor to 0 to floor 9 and elevator is available on the 0th floor think about all the classes and interactions between them

1. Use case 1: Requesting an elevator car
2. Use case 2: Making a request to 4th floor



# Answer

**Classes:**

`public class ElevatorCar`

`public class ElevatorController`

`public class FloorControlPanel`

`public class DestinationControlPanel`

`public class Display`

`public class Button`

`public enum CarDirection`

Assume that  the `ElevatorCar` is initialized with `currentFloor` number as 0 and can move through 0 to 9 floor numbers. The `ElevatorCar` can have three `CarDirection` states i.e. `UP`, `DOWN` and `STANDING`. The `ElevatorController` is the brain of the Elevator system which controls the `ElevatorCar` and `Display` while getting inputs from `FloorControlPanel` and `DestinationControlPanel`.  

## Use Case 1: Requesting an elevator car

A user is standing in front of an Elevator Door. He can see that `Display` shows the `currentFloor` of the `ElevatorCar` and it is at `STANDING` `CarDirection`.

1. The user press the button on the `FloorControlPanel` .
2. The `FloorControlPanel` invokes the `reqeustElevator()`  of `ElevatorController` through `userrequest()`. `ElevatorController` then checks the `CarDirection` and `currentFloor` of `ElevatorCar`.
3. If the `ElevatorCar` is at `STANDING` `CarDirection` and `currentFloor` is the same as the user's current floor, `openDoor()`  is invoked in `ElevatorCar` and `updateDisplay()` is invoked in `FloorControlPanel` . Similarly we can check the direction of the `ElevatorCab` and the direction of the `Botton` triggered by user and we can then have several separate cases with different outcomes. These can direct the `ElevatorCar` to move through floors and also put car requests in queue if needed.

## Use Case 2: Making a request to 4th floor

A user is inside the `ElevatorCar`  and the `Display` shows the `currentFloor` `CarDirection` of the `ElevatorCar` .

1. The user press the button on the `DestinationControlPanel`.
2. The `DestinationControlPanel` invokes `requestFloor()` of `ElevatorController` through `userRequest()`. The `ElevatorController` then checks the request and `CarDirection`and puts the request in a request queue which can be serverd when the `ElevatorCar` reaches that floor. 