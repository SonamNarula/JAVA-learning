package JAVA_Input;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
