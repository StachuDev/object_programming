package pl.imiajd.olszak;

import pl.imiajd.olszak.Person;

public class Teacher extends Person {
    private int salary;

    public Teacher(String surname, int birthYear, int salary){
        super(surname, birthYear);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return super.toString() +" salary: " + salary;
    }
}
