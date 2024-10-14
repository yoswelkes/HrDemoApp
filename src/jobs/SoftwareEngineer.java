package jobs;

import staff.Person;

import java.util.ArrayList;

public class SoftwareEngineer extends OfficeJob{

    public SoftwareEngineer(){
        // Initialize incumbent list if not initialized already
        if (this.incumbentList == null)
            this.incumbentList = new ArrayList<Person>();
    }

    @Override
    public void printJobDescription(){
        System.out.println("This is a software engineer position at a prestigious IT company");
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
