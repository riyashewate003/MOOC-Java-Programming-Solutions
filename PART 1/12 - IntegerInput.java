
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        // write your program here
        System.out.println("You gave the number " + num1);
    }
}
