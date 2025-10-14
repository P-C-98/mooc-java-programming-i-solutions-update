import java.util.ArrayList;
import java.util.Scanner;
 
public class Items {
 
    public static void main(String[] args) {
        // implement here your program that uses the class Item
 
        ArrayList<Item> listItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            listItems.add(new Item(name));
        }
        for(Item item : listItems) {
            System.out.println(item);
            
        }
    }
}