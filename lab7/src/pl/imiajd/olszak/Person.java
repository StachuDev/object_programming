package pl.imiajd.olszak;

public class Person {
    public String surname;
    public int birthYear;

    public Person(){}

    public Person(String surname, int birthYear){
        this.surname = surname;
        this.birthYear = birthYear; // dd-mm-yyyy
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String toString(){
        return surname + " birthYear: " + birthYear;
    }


}


