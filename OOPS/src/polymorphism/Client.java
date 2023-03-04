package polymorphism;

import abstractClass.TataTiago;

public class Client {
    public static void main(String[] args){
        TataNexon tn = new TataNexon();
        tn.startEngine();
        tn.move();
        TataAltroz petrolCar = new TataAltroz();
        petrolCar.startEngine();
        petrolCar.move();
    }
}
