package converter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean cycleControl = true;
        do {
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            switch (scanner.next()) {
                case "/from" -> {
                    System.out.println("Enter number in decimal system: ");
                    int number = scanner.nextInt();
                    System.out.println("Enter target base: ");
                    int decimal = scanner.nextInt();
                    System.out.print("Conversion result: ");
                    System.out.print(binHexOct(number, decimal));
                    System.out.println();
                }
                case "/to" -> {
                    System.out.println("Enter source number: ");
                    String inputNumber = scanner.next();
                    System.out.println("Enter source base:  ");
                    int hexadecimalNumber = scanner.nextInt();
                    System.out.print("Conversion to decimal result: ");
                    System.out.print(binHexOct(inputNumber, hexadecimalNumber));
                    System.out.println();
                }
                case "/exit" -> {
                    cycleControl = false;
                }
                default -> {
                }
            }
        } while(cycleControl);
    }
    
    public static String binHexOct(int number, int decimal) {
        switch(decimal) {
            case 2 -> {
                return Integer.toBinaryString(number);       
            }
            case 8 -> {
                return Integer.toOctalString(number);
            }
            case 16 -> {
                return Integer.toHexString(number);
            }
            default -> {
                return "invalid inputs.";
            }
        }
    }

    public static int binHexOct(String number, int decimal) {
        return Integer.valueOf(number, decimal);
    }
}
