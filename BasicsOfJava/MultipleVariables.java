package BasicsOfJava;

public class MultipleVariables {
    public static void main(String[] args) {
        int x = 5, y = 6;
        System.out.println("The value of x is : " + x);
//        System.out.println(x);
        System.out.println("The value of y is : " + y);
//        System.out.println(y);

        int z = 10;
        z = x / y;
        System.out.println("The value of z is : " + z);
//        System.out.println(z);

        System.out.println(x + y + z);
        System.out.println("Mast cheez : " + x + y + z);

        System.out.println(x + y + "" + z);
    }
}
