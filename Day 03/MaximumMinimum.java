import java.util.Scanner;

public class MaximumMinimum {

    static void max(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b;
        } if (c > max){
            max = c;
        }
        System.out.println("The Maximum Number is: " + max);
    }

    static void min(int a, int b, int c){
        int min = a;
        if (b < min){
            min = b;
        } if (c < min){
            min = c;
        }
        System.out.println("The Minimum Number is: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter The Third Number: ");
        int c = sc.nextInt();

        max(a,b,c);
        min(a,b,c);

        sc.close();
    }
}
