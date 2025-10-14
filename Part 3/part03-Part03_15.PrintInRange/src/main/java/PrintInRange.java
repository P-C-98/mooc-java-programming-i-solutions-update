import java.util.ArrayList;
 
public class PrintInRange {
 
    public static void main(String[] args) {
        // Try your method here        
        ArrayList<Integer> numbers =new ArrayList<>();
        
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);
            
        System.out.println("The numbers in the range of [0, 5]");
        printNumbersInRange(numbers, 0, 5);
        
        System.out.println("The numbers in the range of [3, 10]");
        printNumbersInRange(numbers, 3, 10);
        
        }
        
        public static void printNumbersInRange(ArrayList<Integer> numbers, int lower, int upper) {
            for(int number : numbers) {
                if (number >= lower && number <= upper) {
                    System.out.println(number);
                }
            }
        }
    }