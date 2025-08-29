import java.util.Scanner;

public class OddEven {

    static String oddeven(int a){
        if (a % 2== 0){
            return "It's an Even Number";
        } else {
            return "It's an Odd Number";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        System.out.println(oddeven(a));
        sc.close();
    }
}
