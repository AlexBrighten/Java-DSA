import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine().trim();
        System.out.println("Hi There " + firstName);
        sc.close();
    }
}