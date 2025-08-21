import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        long num = sc.nextLong();
        long temp = num;
        int sum = 0;

        while (temp > 0){
            sum += (int)(temp % 10);
            temp /= 10;
        }

        System.out.println("The sum of the digits = "+ sum);
        sc.close();
    }
}
