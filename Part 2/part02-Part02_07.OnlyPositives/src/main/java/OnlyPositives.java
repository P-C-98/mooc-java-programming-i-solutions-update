import java.util.Scanner;
 
public class OnlyPositives {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int firstNumber = Integer.valueOf(scanner.nextLine());
            
            if (firstNumber > 0) {
                System.out.println(firstNumber * firstNumber);
                continue;
            }else if (firstNumber < 0) {
                System.out.println("Unsuitable number");
                continue;  
            }else if (firstNumber == 0) {
                break;
            } 
        }
    }
}