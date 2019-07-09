
import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args){


        // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0


            System.out.println("Add a number:");
            Scanner scanner = new Scanner (System.in);
            int b = scanner.nextInt();
    }

    public static void divide(int b){

        try {
            int result = 10 / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }

    }
}