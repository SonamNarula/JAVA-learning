package Conditionals;

import java.util.Scanner;

public class ProfitORLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int CP = sc.nextInt();
//        System.out.println("");
        System.out.print("Enter selling price : ");
        int SP = sc.nextInt();

        if (CP > SP) {
            System.out.println("Loss");
        } else if (CP == SP) {
            System.out.println("No profit no loss");
        } else {
            System.out.println("Profit");
        }
    }
}
