import java.util.Scanner;

//1. Assign 3 variables P, T, R for the calculation
//2. Get input from the user
//3. Calculation formula = (P*R*T)/100
//4. Print the answer.

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required details: ");

        System.out.print("Enter the Principle Amount: ");
        float p = sc.nextFloat();

        System.out.print("Enter the Duration (in years): ");
        float t = sc.nextFloat();

        System.out.print("Enter the Interest Rate: ");
        float r = sc.nextFloat();

        float interest = (p * t * r) / 100;

        System.out.printf("The Simple interest is Rupees: ₹%.2f\n ", interest);
        sc.close();
    }
}
