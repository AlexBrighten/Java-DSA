import java.util.Scanner;

public class GreatestNumberof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int power = 1;
        while (power <= N) {
            power *= 2;
        }

        System.out.println(power);
    }
}
