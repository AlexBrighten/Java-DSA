import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int tot = 0;
        for (int i = 2; i < n; i++) {
            tot = a + b;
            System.out.println(tot);
            a = b;
            b = tot;
        }
        sc.close();
    }
}
