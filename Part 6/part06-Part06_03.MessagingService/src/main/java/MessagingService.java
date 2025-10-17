
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
public class MessagingService {
    
    //init the ArrayList
    private ArrayList <Message> messages;
    
    //the init constructor 
    public MessagingService() {
    this.messages = new ArrayList<>();
    }
    
    //adds the array to the list and checks its length 
    public void add(Message message) {
        String text = message.getContent();
        int length = text.length();
        
        if(text.length() <= 280) {
            this.messages.add(message);
            
        }
    }
    //prints the array list
    public ArrayList<Message> getMessages() {
            return this.messages;
        }
    
}
