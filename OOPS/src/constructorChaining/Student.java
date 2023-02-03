package constructorChaining;

public class Student {
    int id;
    String name;
    int roll;
    double percentage;
    public Student(){
        System.out.println("default");

    }
    // Constructor chaining by overloading
    public Student(int x, int y, String n, double d){
        this();
        id = x;
        roll= y;
        name = n;
        percentage = d;
    }

}
