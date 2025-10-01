import java.util.Scanner;
 
public class CountingToHundred {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        int number = Integer.valueOf(scanner.nextLine());
        
        int start = number;
        int end = 100 + 1;
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
 
    }
}