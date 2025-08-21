import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ten digit number: ");
        long n = sc.nextLong();

        System.out.print("Enter the number to find: ");
        int no = sc.nextInt();
        if (no < 0 || no > 9) {
            System.out.println("Please enter a single digit (0–9).");
            return;
        }

        int occ = 0;
        long temp = n;

        while (temp > 0){
            int num = (int)(temp % 10);
            if (num == no){
                occ ++;
            }
            temp /= 10;
        }
        System.out.println("The number of time " + no + " occurred = "+ occ);
    }
}
