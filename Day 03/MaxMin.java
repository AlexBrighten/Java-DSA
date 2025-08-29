import java.util.Scanner;

public class MaxMin {

    static void max(int a,int b,int c){
        System.out.println("The Maximum Number is: " + Math.max(a, Math.max(b,c)));
    }

    static void min(int a,int b,int c){
        System.out.println("The Minimum Number is: " + Math.min(a, Math.min(b,c)));
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
