import java.util.Scanner;
 
public class AbsoluteValue {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        if (firstNum < 0) {
            System.out.println(firstNum * -1);
        }else {
            System.out.println(firstNum);
        }
        
        
 
    }
}