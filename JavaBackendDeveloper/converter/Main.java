package converter;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean cycleControl = true;
        boolean internalRecycle = true;
        do {
            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
            String input = scanner.nextLine();
            switch (input) {
                case "/exit" -> {
                    cycleControl = false;
                }
                default -> {
                    String[] inputArray = input.split(" ");
                    do {
                        System.out.println("Enter number in base " + inputArray[0] + " to convert to base " + inputArray[1] + " (To go back type /back)");
                        String twoinput = scanner.nextLine();
                        switch (twoinput) {
                            case "/back" -> {
                                internalRecycle = false;
                            }
                            default -> {
                                String number1 = new BigInteger(twoinput, Integer.parseInt(inputArray[0])).toString();
                                String number2 = new BigInteger(number1).toString(Integer.parseInt(inputArray[1])); 
                                System.out.println("Conversion result: " +  number2);
                            } 
                        }    
                    } while(internalRecycle);
                    internalRecycle = true;
                }

            }
        } while(cycleControl);
    }
}
