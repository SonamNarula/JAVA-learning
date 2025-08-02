package Loops;

//import java.util.Scanner;

public class TableOf19 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n : ");
//        int n = sc.nextInt();

        for (int i = 1; i <= 190; i++) {
            if (i % 19 == 0) {
                System.out.println(i);
            }
        }
    }
}
