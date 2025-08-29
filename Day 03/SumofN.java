import java.util.Scanner;

public class SumofN {

    static void sum(int n){
        int a = 0;
        for (int i = 0; i < n; i++) {
            a += i;
            System.out.println("The sum of first n natural numbers" + a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sum(n);
    }
}
