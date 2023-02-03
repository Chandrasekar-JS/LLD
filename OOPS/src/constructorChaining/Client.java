package constructorChaining;

public class Client {
    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.percentage);

        Student s1 = new Student(1,2, "chain",90);
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.percentage);
    }
}
