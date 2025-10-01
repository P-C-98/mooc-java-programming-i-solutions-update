import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numberOfPositives = 0;            
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum += number;
                numberOfPositives ++;
            }
            
        }
             
        if (numberOfPositives > 0) {
            double averageOfPositives = (double) sum / numberOfPositives;
            System.out.println("Average of positive numbers: " + averageOfPositives);
        }else {
            System.out.println("Cannot calculate the average");
        }
 
    }
  
}