
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        //creating array
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    //method for adding meals and checking for duplicates
    public void addMeal(String meal) {
      
        if(!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }
    //reading the array list and printing everything
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    } 
    //clears the list
    public void clearMenu() {
        meals.clear();
    }
}
