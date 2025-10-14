
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int resultOne = Integer.valueOf(firstNum + secondNum);
        int resultTwo = Integer.valueOf(firstNum - secondNum);
        int resultThree = Integer.valueOf(firstNum * secondNum);
        int resultFour = Integer.valueOf(firstNum / secondNum);
        
        System.out.println(firstNum + " + " + secondNum + " = " + resultOne);
        System.out.println(firstNum + " - " + secondNum + " = " + resultTwo);
        System.out.println(firstNum + " * " + secondNum + " = " + resultThree);
        System.out.println(firstNum + " / " + secondNum + " = " + (1.0 * firstNum / secondNum));
    }
}
