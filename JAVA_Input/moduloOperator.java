package JAVA_Input;

import java.util.Scanner;

public class moduloOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend : ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor : ");
        int divisor = sc.nextInt();

        int remainder = dividend % divisor;
        System.out.print("Remainder : ");
        System.out.println(remainder);
    }
}
