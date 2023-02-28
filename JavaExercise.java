//1.	Write a Java Program to define a class, describe its constructor, overload the Constructors and instantiate its object
class MyEmployee {
    int salary;
    String name;
    public MyEmployee(){
        salary = 10000;
        name = "Your name";
    }
    public MyEmployee(int s, String n){
        salary = s;
        name = n;
    }

    public String getname(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}

public class JavaExercise {
    public static void main(String[] args) {
        MyEmployee Mohit = new MyEmployee();

    }
}