package numbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("");
        System.out.println("""
                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be processed;
                - separate the parameters with one space;
                - enter 0 to exit.
                """);
        long number = 0L;
        long item = 0L;
        do {
            System.out.println("Enter a request:");
            String input = scanner.nextLine();
            String[] numbers = input.split(" "); 
            number = Long.parseLong(numbers[0]);
            if (numbers.length > 1) {
                item = Long.parseLong(numbers[1]); 
            }
            
            if (item > 0) {
                digitalJudgment(number, item);
            } else if (item < 0) {
                System.out.println("The Second parameter should be a natural number or zero.");
            } else if (number == 0) {
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
        boolean gapful = false;

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

        if (number > 99) {
            long firstPlace = number;
            long end = number % 10;
            while (firstPlace > 10) {
                firstPlace /= 10;
            }

            if (number % (firstPlace * 10 + end) == 0) {
                gapful = true;
            }
        }

        System.out.println("Properties of " + number);
        System.out.println("        even: " + even);
        System.out.println("        odd: " + odd);
        System.out.println("        buzz: " + buzz);
        System.out.println("        duck: " + duck);
        System.out.println("        palindromic: " + palindromic);
        System.out.println("        gapful: " + gapful);
    }

    public static void digitalJudgment(long number, long item) {
        for (int i = 0; i < item; i++) {
            System.out.print(number + " is ");
            if (number % 7 == 0 || number % 10 == 7) {
                System.out.print("buzz, ");
            }

            String stringNumber = String.valueOf(number);
            int length = stringNumber.length();
            if (stringNumber.substring(1, length).contains("0")) {
                System.out.print("duck, ");
            }

            String reverseStringNumber = new StringBuilder(stringNumber).reverse().toString();
            if (stringNumber.equals(reverseStringNumber)) {
                System.out.print("palindromic, ");
            }

            if (number > 99) {
                long firstPlace = number;
                long end = number % 10;
                while (firstPlace > 10) {
                    firstPlace /= 10;
                }

                if (number % (firstPlace * 10 + end) == 0) {
                    System.out.print("gapful, ");
                }
            }
  
            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            number++;
        }
    }
}
