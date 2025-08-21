/*
    Problem Statement
    Kunal is allowed to go out with his friends only on the even days of a given month.
    Write a program to count the number of days he can go out in the month of August.
*/

public class EvenDays {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int count = 0;

        for (int i = 1; i <= daysInAugust; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kunal can go out on " + count + " days in August.");
    }
}

