package abstractClass;

public abstract class Car {
    public int noOfWheels;
    public void move(){
        System.out.println("Car is moving");
    }
    public abstract void startEngine();
}
