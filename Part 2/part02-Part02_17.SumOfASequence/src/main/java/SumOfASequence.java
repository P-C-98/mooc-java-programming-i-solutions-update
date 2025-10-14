import java.util.Scanner;
 
public class SumOfASequence {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.next());
        
        int result = 0;
        
        int i = 1;
        while (i <= lastNumber) {
            result = result + i;
            i = i + 1;
        }
        System.out.println(result);
    }
}
 