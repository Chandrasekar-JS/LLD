package polymorphism;

public class ICEngine extends Car{
    @Override
    public void startEngine(){
        System.out.println("Engine Started....");
    }

    @Override
    public void move() {
        System.out.println("Car moving...");
    }
}
