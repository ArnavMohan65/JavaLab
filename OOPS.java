class Employee {
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class Cellphone {
    public void ringing(){
        System.out.println("ringing");
    }
    public void Vibrating(){
        System.out.println("Vibrating");
    }
    public void Callfriend(){
        System.out.println("Calling..");
    }
}

class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}

class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2*(length + breadth);
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }public void run(){
        System.out.println("running from the enemy");
    }public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class OOPS{
    public static void main(String[] args) {

        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
        Cellphone asus = new Cellphone();
        asus.ringing();
        asus.Vibrating();
        asus.Callfriend();

        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        Rectangle rec = new Rectangle();
        rec.length = 3;
        rec.breadth = 5;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());


        TommyVecetti player1 = new TommyVecetti();
        player1.fire();
        player1.hit();
        player1.run();


    }
}
