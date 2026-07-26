package Abstraction_and_Polymorphism;
public abstract class Vehicle implements Transport {
    private int noOFTires;
    public abstract void makeStartSound();
    @Override
    public void getSetGo(){
        System.out.println("going to place");
    }

    public Vehicle(int noOFTires){
        this.noOFTires = noOFTires;
    }
    public int getNoOFTires(){
        return noOFTires;
    }
    public void setNoOFTires(int noOFTires){
        this.noOFTires = noOFTires;
    }
    public void commute(){
        System.out.println("going......");
    }
}
