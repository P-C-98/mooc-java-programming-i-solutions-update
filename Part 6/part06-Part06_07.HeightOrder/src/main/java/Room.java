/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
import java.util.ArrayList;

//create our array which stores data from our Person class and we give it the name persons
public class Room {
    private ArrayList<Person> persons;

    //we use the this.persons = new ArrayList<>(); to set up the actual list to memory
public Room() {
    this.persons = new ArrayList<>();
}

//this arraylist adds data from person class
public void add(Person person) {
    this.persons.add(person);
}

//this arrayclass returns a flase if there is no data inside
public boolean isEmpty() {
    return this.persons.isEmpty();   
}

//this prints/returns the contents of the list
public ArrayList<Person> getPersons() {
    return persons;
    }
//returns null if list is empty
public Person shortest() {
    if (this.persons.isEmpty()) {
        return null;
    }
//create a variable shortest person and start it at num 0 of the list
Person shortestPerson = this.persons.get(0);

//compare the list with the list  /  compare the heights and return shortest
for (Person person : this.persons) {
    if(person.getHeight() < shortestPerson.getHeight()) {
        shortestPerson = person;
    }
}

return shortestPerson;
    }

//similar to the above but instead it removes the shortest
public Person take() {
    if (this.persons.isEmpty()) {
        return null;
    }
    
    Person shortestPerson = this.shortest();
    
    this.persons.remove(shortestPerson);
       
        return shortestPerson;
    }
}

    
  