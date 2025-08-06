import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String a = sc.next();
        String b = new StringBuilder(a).reverse().toString();
        if (a.equalsIgnoreCase(b)){
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is not Palindrome");
        }
    }
}
