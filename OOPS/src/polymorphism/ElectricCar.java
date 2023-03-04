package polymorphism;

public class ElectricCar extends Car{
    @Override
    public void startEngine(){
        System.out.println("Motor is ON....");
    }

    @Override
    public void move() {
        System.out.println("Car moving");
    }
}
