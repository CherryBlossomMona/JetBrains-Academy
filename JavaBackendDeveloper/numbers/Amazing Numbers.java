package numbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("");
        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.");
        long number = 0l;
        do {
            System.out.print("Enter a request:");
            number = scanner.nextLong();
            if (number == 0) {
                System.out.println("Goodbye!");
            } else if (number > 0) {
                digitalJudgment(number);
            } else {
                System.out.println("The first parameter should be a natural number or zero.");
            }  
        } while (number != 0); 
    }

    public static void digitalJudgment(long number) {
        boolean even = false;
        boolean odd = false;
        boolean buzz = false;
        boolean duck = false;
        boolean palindromic = false;

        if (number % 2 == 0) {
            even = true;
        } else {
            odd = true;
        }

        if (number % 7 == 0 || number % 10 == 7) {
            buzz = true;
        }

        String stringNumber = String.valueOf(number);
        int length = stringNumber.length();
        if (stringNumber.substring(1, length).contains("0")) {
            duck = true;
        }
        
        String reverseStringNumber = new StringBuilder(stringNumber).reverse().toString(); 
        if (stringNumber.equals(reverseStringNumber)) {
            palindromic = true;
        }

        System.out.println("Properties of " + number);
        System.out.println("        even: " + even);
        System.out.println("        odd: " + odd);
        System.out.println("        buzz: " + buzz);
        System.out.println("        duck: " + duck);
        System.out.println("        palindromic: " + palindromic);

    }
}
