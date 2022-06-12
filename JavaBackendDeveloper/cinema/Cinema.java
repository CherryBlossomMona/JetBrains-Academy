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
        
        System.out.println("Cinema:");
        for (int i = 0; i < cinemaRoom.length; i++) {
            for (int j = 0; j < cinemaRoom[i].length; j++) {
                System.out.print(cinemaRoom[i][j] + " ");   
            }
            System.out.println();
        }
        
        System.out.println("Enter a row number:");
        int buyRows = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int buySeats = scanner.nextInt();

        int price = 0;
        if (rows * seats < 60) {
            price = 10;
        }else if (buyRows <= rows / 2) {
            price = 10;
        } else {
            price = 8;
        }
        System.out.println();
        System.out.println("Ticket price: $" + price);
        
        cinemaRoom[buyRows][buySeats] = "B";
        System.out.println("Cinema:");
        for (int i = 0; i < cinemaRoom.length; i++) {
            for (int j = 0; j < cinemaRoom[i].length; j++) {
                System.out.print(cinemaRoom[i][j] + " ");   
            }
            System.out.println();
        }
        
    }
}
