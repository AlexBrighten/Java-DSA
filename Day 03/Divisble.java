import java.util.Scanner;

public class Divisble {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a random number: ");
        int userInput = obj.nextInt();
        System.out.print("Enter the number to check if the number 1 is divisible by this number: ");
        int in = obj.nextInt();
        if(userInput % in == 0){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
