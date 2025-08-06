import java.util.Scanner;

//1. Get a number as input
//2. if num%2 == 0 then it is even
//3. Else Odd.

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n + " is an Even number");
        } else{
            System.out.println(n + " is an odd number");
        }
        sc.close();
    }
}
