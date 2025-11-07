
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
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    private int totalWeight;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.getWeight() <= this.maximumWeight) {
        this.suitcases.add(suitcase);
        this.totalWeight += suitcase.getWeight();
        }
    }
    
    public void printItems() {
            if(this.suitcases.isEmpty()) {
            System.out.println("hold is empty");
            }
            for (Suitcase suitcases : this.suitcases) {
                suitcases.printItems();
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases" + "(" + this.totalWeight + "kg)";
    }
}
