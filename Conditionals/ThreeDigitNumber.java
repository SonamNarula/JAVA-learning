package Conditionals;

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if (n > 99 && n < 1000) {
            System.out.println("The number is a 3 digit number");
        } else {
            System.out.println("The number is not a 3 digit number");
        }
    }
}
