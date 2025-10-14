import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
    String finalName = "";
    int longestName = 0;
    double averageYear = 0;
    int sum = 0;
    int count = 0;
     
    while(true) {
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            break;
        }
        
        String[]pieces = input.split(",");
        String name = pieces[0].trim();
        int length = name.length(); 
        if (length > longestName) {
            longestName = length;
            finalName = name;
        }
   
        sum = sum + Integer.valueOf(pieces[1]);
        count = count + 1;
        }
    
        if (count > 0) {
            System.out.println("Longest name: " + finalName);
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        }
    }
}