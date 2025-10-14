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
public class Main {
    
        public static void main(String[] args) {
        
        ArrayList<NumberOfStrings> strings = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        int i = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            i = i + 1;
        }
            System.out.println(i);
        }
    }