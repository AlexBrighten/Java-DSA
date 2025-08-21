import java.util.Scanner;

/* Problem Statement
    Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
    from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
 */

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers (0 to stop): ");
        int n = sc.nextInt();

        int negative = 0;
        int positiveOdd = 0;
        int positiveEven = 0;

        while( n != 0 ){
            if (n < 0){
                negative += n;
            } if (n > 0 && n % 2 == 0){
                positiveEven += n;
            } if (n > 0 && n % 2 == 1){
                positiveOdd += n;
            }
            n = sc.nextInt();
        }

        System.out.println("The sum of Negative numbers are : "+ negative);
        System.out.println("The sum of Positive Even numbers are : "+ positiveEven);
        System.out.println("The sum of Positive Odd numbers are : "+ positiveOdd);
    }
}
