import java.util.Scanner;
 
public class Login {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    //input
        System.out.println("Enter username: ");
        String name = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
    //processing true / false info
        if(name.equals("alex") & password.equals("sunshine")){
            System.out.println("You have successfully logged in!");
            return;
        }
        
        if(name.equals("emma") & password.equals("haskell")){
            System.out.println("You have successfully logged in!");
            
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}