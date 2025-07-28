package JAVA_Input;

import java.util.Scanner;

public class SumOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        System.out.print("Sum of x and y is : ");
        System.out.println(x + y);
    }
}
