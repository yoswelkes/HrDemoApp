package jobs;

import staff.Person;

import java.time.LocalDateTime;

public interface Job {
    public double salary = 0.0;
    public LocalDateTime startShift = LocalDateTime.now();
    public LocalDateTime endShift = LocalDateTime.now();
    public void printJobDescription();
    public void printWorkers();
    public void hirePerson(Person employee);
    public void firePerson(Person newRecruit);
}
