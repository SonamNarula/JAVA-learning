package JAVA_Input;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend : ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor : ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend - (divisor * quotient);

        System.out.print("The remainder  is :");
        System.out.println(remainder);
    }
}
