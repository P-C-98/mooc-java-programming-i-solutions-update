
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;
    private int totalWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= this.maximumWeight) {
        this.items.add(item);
        this.totalWeight += item.getWeight();
        }
    } 
    
    public void printItems() {
        for(Item items : this.items) {
            System.out.println(items);
        }
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()){
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for (Item item : this.items) {
            if(item.getWeight() > heaviestItem.getWeight()) {
            heaviestItem = item;
        }
    }
        return heaviestItem;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items " + "(" + this.totalWeight + "kg)";
        }   
        if (this.items.size() > 1) {
            return this.items.size() + " items" + " (" + this.totalWeight + "kg)";
        }
        return this.items.size() + " item" + " (" + this.totalWeight + "kg)";
    }

    public int getWeight() {
        return this.totalWeight;
    }
}
