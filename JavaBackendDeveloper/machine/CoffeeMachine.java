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
        boolean coffeeMachineCycle = true;
        
        

        do {
            menu:
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "buy":                 
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = scanner.next();
                    switch (choice) {
                        case "1":
                            coffeeMachineWater -= 250;
                            coffeeMachineCoffeeBeans -= 16;
                            coffeeMachineCups -= 1;
                            coffeeMachineMoney += 4;
                            if (coffeeMachineWater >= 0 && coffeeMachineCoffeeBeans >= 0 && coffeeMachineCups >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (coffeeMachineWater < 0) {
                                   System.out.println("Sorry, not enough water!"); 
                                }
                                if (coffeeMachineCoffeeBeans < 0) {
                                   System.out.println("Sorry, not enough coffee beans!"); 
                                } 
                                if (coffeeMachineCups < 0) {
                                   System.out.println("Sorry, not enough cups!"); 
                                }
                                coffeeMachineWater += 250;
                                coffeeMachineCoffeeBeans += 16;
                                coffeeMachineCups += 1;
                                coffeeMachineMoney -= 4;  
                            }
                            break;
                        case "2":
                            coffeeMachineWater -= 350;
                            coffeeMachineCoffeeBeans -= 20;
                            coffeeMachineMilk -= 75;
                            coffeeMachineCups -= 1;
                            coffeeMachineMoney += 7;
                            if (coffeeMachineWater >= 0 && coffeeMachineCoffeeBeans >= 0 && coffeeMachineCups >= 0 && coffeeMachineMilk >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (coffeeMachineWater < 0) {
                                   System.out.println("Sorry, not enough water!"); 
                                }
                                if (coffeeMachineCoffeeBeans < 0) {
                                   System.out.println("Sorry, not enough coffee beans!"); 
                                } 
                                if (coffeeMachineCups < 0) {
                                   System.out.println("Sorry, not enough cups!"); 
                                }
                                if (coffeeMachineMilk < 0) {
                                   System.out.println("Sorry, not enough milk!"); 
                                }
                                coffeeMachineWater += 350;
                                coffeeMachineCoffeeBeans += 20;
                                coffeeMachineMilk += 75;
                                coffeeMachineCups += 1;
                                coffeeMachineMoney -= 7; 
                            }
                            break;
                        case "3":
                            coffeeMachineWater -= 200;
                            coffeeMachineCoffeeBeans -= 12;
                            coffeeMachineMilk -= 100;
                            coffeeMachineCups -= 1;
                            coffeeMachineMoney += 6;
                            if (coffeeMachineWater >= 0 && coffeeMachineCoffeeBeans >= 0 && coffeeMachineCups >= 0 && coffeeMachineMilk >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (coffeeMachineWater < 0) {
                                   System.out.println("Sorry, not enough water!"); 
                                }
                                if (coffeeMachineCoffeeBeans < 0) {
                                   System.out.println("Sorry, not enough coffee beans!"); 
                                } 
                                if (coffeeMachineCups < 0) {
                                   System.out.println("Sorry, not enough cups!"); 
                                }
                                if (coffeeMachineMilk < 0) {
                                   System.out.println("Sorry, not enough milk!"); 
                                }
                                coffeeMachineWater += 200;
                                coffeeMachineCoffeeBeans += 12;
                                coffeeMachineMilk += 100;
                                coffeeMachineCups += 1;
                                coffeeMachineMoney -= 6; 
                            }
                            break;
                        case "back":
                            continue;
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
                case "remaining":
                    System.out.println("");
                    System.out.println("The coffee machine has:");
                    System.out.println(coffeeMachineWater + " ml of water");
                    System.out.println(coffeeMachineMilk + " ml of milk");
                    System.out.println(coffeeMachineCoffeeBeans + " g of coffee beans");
                    System.out.println(coffeeMachineCups + " disposable cups");
                    System.out.println("$" + coffeeMachineMoney + " of money");
                    System.out.println("");
                    break;
                case "exit":
                    coffeeMachineCycle = false;
                    break;
                default:
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    break;                        
                }
        } while(coffeeMachineCycle);     

    }
}
