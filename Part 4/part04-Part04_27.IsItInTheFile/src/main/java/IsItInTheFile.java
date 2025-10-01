import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class IsItInTheFile {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String search = scanner.nextLine();
 
        ArrayList<String> list = new ArrayList<>();
        
        try(Scanner fileScan = new Scanner(Paths.get(file))) {
            
            while(fileScan.hasNextLine()) {
                list.add(fileScan.nextLine());
            }
            
            if (list.contains(search)) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }
    } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
 