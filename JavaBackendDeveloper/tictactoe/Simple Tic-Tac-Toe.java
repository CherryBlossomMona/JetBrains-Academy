package tictactoe;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i < number; i++) {
            counter++;
            for (int j = 0; j < counter; j++) {
                System.out.print(counter + " ");
            }

        }
    }
}