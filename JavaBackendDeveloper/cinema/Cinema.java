package cinema;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        String[][] cinemaRoom = new String[rows + 1][seats + 1];
        for (int i = 0; i < cinemaRoom.length; i++) {
            for (int j = 0; j < cinemaRoom[i].length; j++) {
                if (j == 0 && i == 0) {
                    cinemaRoom[i][j] = " "; 
                } else if (i == 0) {
                    cinemaRoom[i][j] = "" + j;
                } else if (j == 0) {
                    cinemaRoom[i][j] = "" + i;
                } else {
                    cinemaRoom[i][j] = "S";
                }
            }
        }
        
        int counter = 0;
        int condition = 0;
        int buyTotalPrice = 0;
        int totalPrice = 0;
        int price = 0;     
        
        do {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Cinema:");
                    for (int i = 0; i < cinemaRoom.length; i++) {
                        for (int j = 0; j < cinemaRoom[i].length; j++) {
                            System.out.print(cinemaRoom[i][j] + " ");   
                        }
                        System.out.println();
                    } 
                    break;
                case 2:
                    do {    
                        System.out.println("Enter a row number:");
                        int buyRows = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        int buySeats = scanner.nextInt();
                        
                        if (buyRows > rows || buySeats > seats) {
                            System.out.println("Wrong input!");
                        } else if ("B".equals(cinemaRoom[buyRows][buySeats])) {
                            System.out.println("That ticket has already been purchased!");
                        } else {
                            if (rows * seats < 60) {
                                price = 10;
                            }else if (buyRows <= rows / 2) {
                                price = 10;
                            } else {
                                price = 8;
                            }
                            System.out.println();
                            buyTotalPrice += price;
                            System.out.println("Ticket price: $" + price);
                            cinemaRoom[buyRows][buySeats] = "B";
                            condition = 1;
                        } 
                        

                    } while(condition == 0); 
                    condition = 0;
                    break;
                case 3:
                    int seatsCounter = 0;
                    for (int i = 0; i < cinemaRoom.length; i++) {
                        for (int j = 0; j < cinemaRoom[i].length; j++) {
                            if ("B".equals(cinemaRoom[i][j])) {
                                seatsCounter++; 
                            }   
                        }
                    }
                    
                    if (rows * seats < 60) {
                            totalPrice = 10 * rows * seats;
                        }else if (rows % 2 == 0) {
                            totalPrice = 10 * (rows / 2) * seats + 8 * (rows / 2) * seats;
                        } else {
                            totalPrice = 10 * (rows / 2) * seats + 8 * (rows / 2 + 1) * seats;
                    }
                    
                    double percentage = seatsCounter / (double)(rows * seats) * 100; 
                    String percentageString = String.format("Percentage: %1.2f%%", percentage);
                    System.out.println();  
                    System.out.println("Number of purchased tickets: " + seatsCounter);
                    System.out.println(percentageString);
                    System.out.println("Current income: $"+ buyTotalPrice);
                    System.out.println("Total income: $" + totalPrice);
                    break;
                case 0: 
                    counter = 1;
                    break;
                default:
                    break;
            }                   
        } while(counter == 0);
    }
}   
