import java.util.Scanner;
 
public class Squared {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        int result = firstNum * firstNum;
        System.out.println(result);
           
    }
}