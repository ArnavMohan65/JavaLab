import java.util.*;
public class cbse {
    public static void main(String[] args) {
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("subjects: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("marks" + i + ":");
            float m = sc.nextFloat();
            sum += m;
        }
        float t = sc.nextFloat();
        System.out.println((sum/(n * t)) * 100);
    }
}
