import jobs.*;
import staff.*;

public class Main {
    public static void main(String[] args) {
        Job job1 = new SoftwareEngineer();
        Job job2 = new TaxiDriver();

        Person yosief = new Person("Yosief", "Kesete", null);
        Person alpha = new Person("Alpha", "Ntinduka", null);
        Person teme  = new Person("Temesghen", "Bahta", null);
        Person guled = new Person("Abdulahi", "Abdikadir", null);
        Person melissa = new Person("Melisa", "Feza", alpha);
        Person mawuwa = new Person("Mawua", "Mudidi", melissa);
        Person hana  = new Person("Hana", "Debay", yosief);
        Person wafi = new Person("Wafi", "Izzeldin", null);
        Person dawudi = new Person("Dawood", "Admed", null);
        Person elshazli = new Person("Elshazli", "Musa", dawudi);

        SoftwareEngineer seJob = new SoftwareEngineer();
        seJob.hirePerson(yosief);
        seJob.hirePerson(guled);
        seJob.hirePerson(alpha);
        seJob.hirePerson(mawuwa);
        seJob.hirePerson(hana);

        TaxiDriver taxiDriver =  new TaxiDriver();
        taxiDriver.hirePerson(teme);
        taxiDriver.hirePerson(melissa);
        taxiDriver.hirePerson(wafi);
        taxiDriver.hirePerson(elshazli);
        taxiDriver.hirePerson(dawudi);

    }
}
