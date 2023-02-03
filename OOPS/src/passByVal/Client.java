package passByVal;

public class Client {
    public static void main(String[] args){
        Student s = new Student();
        s.id = 2;
        int i = 2;
        System.out.println("Student id: " + s.id);
        System.out.println("I : " + i);

        doubleValue(i);
        doubleId(s);

        nullify(s);

        System.out.println("Student id: " + s.id);
        System.out.println("I : " + i);


    }

    public static void doubleValue(int i){
        i = i * 2;
    }

    public static void doubleId(Student s){
        s.id = s.id * 2;
    }

    public static void nullify(Student s){
        s.id = s.id * 2;
        s = null;
    }
}
