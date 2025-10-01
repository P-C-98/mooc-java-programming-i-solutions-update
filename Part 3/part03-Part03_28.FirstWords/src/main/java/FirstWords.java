import java.util.Scanner;
 
public class FirstWords {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
                break;
                }
 
            if (text.isEmpty()) {
                break;
            }
        }
    }
}