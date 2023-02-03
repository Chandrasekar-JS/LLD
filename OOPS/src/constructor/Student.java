package constructor;

public class Student {
    public int id;
    public String name;
    public int roll;
    public double percentage;


    //    no args constructor
    public Student(){
        id =  1;
        name = "Rambo";
        roll = 1;
        percentage = 87.33;

    }

    //    Constructor overloading
    public Student(int studentId, String studentName){
        id = studentId;
        name = studentName;
    }

    //    Constructor overloading
    public Student(int studentId, String StudentName, double studentPercentage){
        id = studentId;
        name = StudentName;
        percentage = studentPercentage;
    }

    //copy constructor
    public Student(Student s){
        id = s.id;
        name = s.name;
    }
}
