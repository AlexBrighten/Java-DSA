import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        prime(a);
    }

    static void prime(int a){
        if (a <= 1){
            System.out.println("no");
            return;
        }
        else if (a == 2){
            System.out.println("yes");
            return;
        }
        else if (a % 2 == 0){
            System.out.println("no");
            return;
        }
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
