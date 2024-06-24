
import java.util.Scanner;

public class PracticeSet2_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter value of a: " + a);
        int v = sc.nextInt();
        System.out.println("Enter value of v: " + v);
        int u = sc.nextInt();
        System.out.println("Enter value of u: " + u);
        int s = sc.nextInt();
        System.out.println("Enter value of s: " + s);


        float ans = (v*v - u*u)/2*(a*s);
        System.out.println("The answer is: " + ans);
    }
}
