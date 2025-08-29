import java.util.Scanner;

public class CheckBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int low = Math.min(num1, num2);
        int high = Math.max(num1, num2);

        if (a >= low && a <= high) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}