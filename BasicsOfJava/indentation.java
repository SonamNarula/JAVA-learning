package BasicsOfJava;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class indentation {
    public static void main(String[] args) {
        {
            System.out.println("This is inside the block.");
        }

        System.out.println("This is outside the block.");
    }
}