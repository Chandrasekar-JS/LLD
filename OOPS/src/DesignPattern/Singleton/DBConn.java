package DesignPattern.Singleton;

public class DBConn {
    private static DBConn obj;

    private DBConn(){
    }

    public static DBConn getObject(){
        if(obj==null){
            obj = new DBConn();
        }
        return obj;
    }
}
