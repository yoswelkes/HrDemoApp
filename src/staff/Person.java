package staff;

public class Person {
    public String firstName;
    public String lastName;
    public Person boss;

    public Person(String firstName, String lastName, Person boss){
        this.firstName = firstName;
        this.lastName = lastName;
        if (boss != null)
            this.boss = boss;
    }
}
