package constructor;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args){
        Student studentObj1 = new Student();
        System.out.println(studentObj1.id);
        System.out.println(studentObj1.name);
        System.out.println(studentObj1.roll);
        System.out.println(studentObj1.percentage);
        System.out.println();

        Student studentObj2 = new Student(10, "Chandru");
        System.out.println(studentObj2.id);
        System.out.println(studentObj2.name);
        System.out.println(studentObj2.roll);
        System.out.println(studentObj2.percentage);
        System.out.println();

        Student studentObj3 = new Student(11, "Sekar", 83.7);
        System.out.println(studentObj3.id);
        System.out.println(studentObj3.name);
        System.out.println(studentObj3.roll);
        System.out.println(studentObj3.percentage);
        System.out.println();

        Student obj = new Student(10, "sekar");
        Student deepCopy= new Student(obj);
        deepCopy.id = 3;
        deepCopy.name = "deep copy";
        System.out.println(deepCopy.id);
        System.out.println(deepCopy.name);
        System.out.println();

        Student shallowCopy = obj;
        System.out.println(shallowCopy.id);
        System.out.println(shallowCopy.name);
    }
}
