import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int duplicate = n;
        int len = String.valueOf(n).length();
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, len);
            n = n / 10;
        }
        if (sum == duplicate){
            System.out.println("The given number is an armstrong number");
        } else {
            System.out.println("The given number is not an armstrong number");
        }
        sc.close();
    }
}