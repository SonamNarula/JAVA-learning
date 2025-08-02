package Loops;

import java.util.Scanner;

public class CountingEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {  // check i, not n
                System.out.println(i);
            }
        }
    }
}
