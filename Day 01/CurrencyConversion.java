import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        float amt = sc.nextFloat();
        double usd = 0.01141; // Rate as per 6th August 2025
        System.out.printf("%.2f to USD = $%.2f",amt,amt*usd);
    }
}
