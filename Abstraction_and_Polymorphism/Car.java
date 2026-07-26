package Abstraction_and_Polymorphism;
public class Car extends Vehicle implements Transport{
    private int noOfDoors;
    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vroomm...");
    }

    public void commute() {
    }
}
