import java.util.Scanner;
public class InOut {
    public static void main(String[] args){
        System.out.println("Works!");
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : ");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("2 : ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
//        int sum = a + b;
        float sum = a + b;
        System.out.println("The Sum is : ");
        System.out.println(sum);

    }
}
