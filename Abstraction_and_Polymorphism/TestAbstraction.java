 package Abstraction_and_Polymorphism;

 import inheritance.InheritanceTest;

 public class TestAbstraction {
    public static void main(String[] args){
        //Vehicle veh = new Vehicle(noOfTires:2);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
    }


}
