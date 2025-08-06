import java.util.Scanner;

// 1. Take two any numbers
// 2. Take an operator to perform simple calculation
// 3. Using switch case for different operator
// 4. Perform the operation and print out according to the user's selection

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the Operation (+, -, *, /, %): ");
        String symbol = sc.next();

        switch (symbol) {
            case "+":
                System.out.printf("The addition of the two numbers are: %d", a+b);
                break;
            case "-":
                System.out.printf("The subtraction of the two numbers are: %d", a-b);
                break;
            case "*":
                System.out.printf("The multiplication of the two numbers are: %d", a*b);
                break;
            case "/":
                if (b == 0){
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.printf("The division of the two numbers are: %.2f", (float)a/b);
                }
                break;
            case "%":
                if (b == 0){
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.printf("The remainder of the two numbers are: %d", a%b);
                }
                break;
            default:
                System.out.println("Enter a valid operator");
        }
        sc.close();
    }
}
