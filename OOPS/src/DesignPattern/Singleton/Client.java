package DesignPattern.Singleton;

public class Client {
    public static void main(String[] args){
        DBConn db = DBConn.getObject();
    }
}
