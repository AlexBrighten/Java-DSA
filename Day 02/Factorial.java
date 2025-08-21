import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("Factorial is not defined for negative numbers!");
        }
        else{
            long tot = 1;
            for (int i = 1; i <= n; i++) {
                tot *= i;
                System.out.print(tot);
            }
        }
    }
}