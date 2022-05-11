package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int coffeeMachineWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int coffeeMachineMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeMachineCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        int cupWater = coffeeMachineWater / 200;
        int cupMilk = coffeeMachineMilk / 50;
        int cupCoffeeBeans = coffeeMachineCoffeeBeans / 15;
        int maxCups = 0;
        if (cupWater <= cupMilk && cupWater <= cupCoffeeBeans) {
            maxCups = cupWater; 
        } else if (cupMilk <= cupWater && cupMilk <= cupCoffeeBeans) {
            maxCups = cupMilk;
        } else {
            maxCups = cupCoffeeBeans;
        }
        
        if (maxCups == cups) {
            System.out.println("Yes, I can make that amount of coffee"); 
        } else if (maxCups > cups) {
            int moreThan = maxCups - cups;  
            System.out.println("Yes, I can make that amount of coffee (and even "+ moreThan +" more than that)");   
        } else if (maxCups > cups && cups == 0) {
            System.out.println("Yes, I can make that amount of coffee (and even 1 more than that)");
        } else{
            System.out.println("No, I can make only "+ maxCups +" cup(s) of coffee");
        }    
    }
}
