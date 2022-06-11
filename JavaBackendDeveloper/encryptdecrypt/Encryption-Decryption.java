package encryptdecrypt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(); 
        String message = scanner.nextLine();
        int numberKey = scanner.nextInt();
        
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                builder.append(' ');
                continue;
            }
            if (message.charAt(i) + numberKey > 'z') {
                builder.append((char)(message.charAt(i) + numberKey - 26)); 
            } else {
                builder.append((char)(message.charAt(i) + numberKey));
            }
        }
         
        String stringKey = builder.toString();
        System.out.println(stringKey);       
        
          
    }
}
