package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffeeMachineWater = 400;
        int coffeeMachineMilk = 540;
        int coffeeMachineCoffeeBeans = 120;
        int coffeeMachineCups = 9;
        int coffeeMachineMoney = 550;
        
        
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachineWater + " ml of water");
        System.out.println(coffeeMachineMilk + " ml of milk");
        System.out.println(coffeeMachineCoffeeBeans + " g of coffee beans");
        System.out.println(coffeeMachineCups + " disposable cups");
        System.out.println("$" + coffeeMachineMoney + " of money");
        System.out.println("");

        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        coffeeMachineWater -= 250;
                        coffeeMachineCoffeeBeans -= 16;
                        coffeeMachineCups -= 1;
                        coffeeMachineMoney += 4;
                        break;
                    case 2:
                        coffeeMachineWater -= 350;
                        coffeeMachineCoffeeBeans -= 20;
                        coffeeMachineMilk -= 75;
                        coffeeMachineCups -= 1;
                        coffeeMachineMoney += 7;
                        break;
                    case 3:
                        coffeeMachineWater -= 200;
                        coffeeMachineCoffeeBeans -= 12;
                        coffeeMachineMilk -= 100;
                        coffeeMachineCups -= 1;
                        coffeeMachineMoney += 6;
                        break;
                    default:
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                        break;
                    } 
                    break;
            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                int addCoffeeMachineWater = scanner.nextInt();
                coffeeMachineWater += addCoffeeMachineWater;
                System.out.println("Write how many ml of milk you want to add:");
                int addCoffeeMachineMilk = scanner.nextInt();
                coffeeMachineMilk += addCoffeeMachineMilk;
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addCoffeeMachineCoffeeBeans = scanner.nextInt();
                coffeeMachineCoffeeBeans += addCoffeeMachineCoffeeBeans;
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int addCoffeeMachineCups = scanner.nextInt(); 
                coffeeMachineCups += addCoffeeMachineCups;
                break;
            case "take":
                System.out.println("I gave you $" + coffeeMachineMoney);
                coffeeMachineMoney = 0;
                break;
            default:
                System.out.println("Write how many disposable cups of coffee you want to add:");
                break;                        
            }
        System.out.println("");
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachineWater + " ml of water");
        System.out.println(coffeeMachineMilk + " ml of milk");
        System.out.println(coffeeMachineCoffeeBeans + " g of coffee beans");
        System.out.println(coffeeMachineCups + " disposable cups");
        System.out.println("$" + coffeeMachineMoney + " of money");     

    }
}

