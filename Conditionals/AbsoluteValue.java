package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        int absolutevalue;
        if (number < 0) {
            absolutevalue = -number;
        } else {
            absolutevalue = number;
        }

        System.out.println("The absolute value is : " + absolutevalue);
    }
}
