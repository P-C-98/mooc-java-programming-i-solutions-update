import java.util.Scanner;
 
public class NameOfTheOldest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int age = 0;
        int currentAge = 0;
        String oldestName = "";
        
        while(true) {
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            break;
        }
        
        String[]pieces = input.split(",");
        String name = pieces[0].trim();
        currentAge = Integer.valueOf(pieces[1]);
        if(currentAge > age) {
            age = currentAge;
            oldestName = name;
            }
        }
        System.out.println(oldestName);
    }
}