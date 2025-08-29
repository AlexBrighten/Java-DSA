import java.util.Scanner;

// Write a program to print the sum of two numbers entered by user by defining your own method.

public class Sum {

    static int product(int a, int b){
        return a*b;
    }

    static int division(int a, int b){
        if (b == 0){
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a/b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int b = sc.nextInt();

        System.out.println("The sum of two number = "+ sum(a,b));
        System.out.println("The difference of two number = "+ sub(a,b));
        System.out.println("The product of two number = "+ product(a,b));
        System.out.println("The division of two number = "+ division(a,b));

        sc.close();
    }
}
