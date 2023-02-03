package abstractClass;

public class Client {
    public static void main(String[] args){
        TataTiago t = new TataTiago();
        t.noOfWheels = 4;
        t.startEngine();
        t.move();
    }
}
