
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();

       
        if(word.equals("end")) {
            System.out.println("Bye bye!");
            break;
        }
        
        if(word.equals("add")) {
            System.out.println("word: ");
            String input = scanner.nextLine();
            System.out.println("translation: ");
            String input2 = scanner.nextLine();
            
            this.dictionary.add(input, input2);
        }   
        
        if(word.equals("search")) {
            System.out.println("To be translated: ");
            String search = scanner.nextLine();
            
            
            String translation = this.dictionary.translate(search);
            
            if (translation == null) {
                System.out.println("Word " + search + " was not found");
            }else{
                System.out.println("Translation: " + translation); 
                }
            }
            System.out.println("Unknown command");
        }
    }
}
