package jobs;

import staff.Person;

import java.util.ArrayList;

public class TaxiDriver extends OutsideJob{

    public TaxiDriver(){
        // Initialize incumbent list if not initialized already
        if (this.incumbentList == null)
            this.incumbentList = new ArrayList<Person>();
    }

    @Override
    public void printJobDescription(){
        System.out.println("This is a taxi driver position giving premium corporate transit services.");
    }

    @Override
    public void printWorkers() {
        for(Person employee : incumbentList)
        {
            System.out.println("Name: " + employee.firstName + " " + employee.lastName);
        }
    }

    @Override
    public void hirePerson(Person employee){
        this.incumbentList.remove(employee);
    }

    @Override
    public void firePerson(Person newRecruit){
        this.incumbentList.add(newRecruit);
    }
}
