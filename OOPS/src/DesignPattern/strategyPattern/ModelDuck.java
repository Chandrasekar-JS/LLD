package DesignPattern.strategyPattern;

public class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    public void display(){
        System.out.println("I'm a model duck");
    }

}
