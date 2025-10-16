
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
public class Stack {
    //created the array to hold String values
    private ArrayList<String> values;
    
    //create constructor 
    public Stack() {
        this.values = new ArrayList<>();
    }

    //checks if stack is empty
    public boolean isEmpty() {
        return this.values.isEmpty();
    }
    //adds new item to the stack
    public void add(String value) {
        this.values.add(value);
    }
    //returns the items from the stack
    public ArrayList<String> values() {
        return this.values;
        }
    
    public String take() {
        String topValue = values.get(values.size() -1);
        
        values.remove(values.size() -1);
        
        return topValue;
      
    }
}
        
