import java.util.Arrays;
import java.util.Scanner;
    public class OddEvenSum {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String userInput = in.nextLine();
            String[] str = userInput.split(" ");

            int[] num = new int[str.length];

            int sum = 0;
            for (int i = 0; i < str.length; i++) {
                num[i] = Integer.parseInt(str[i]);
                sum += num[i];
            }

            if (sum % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
