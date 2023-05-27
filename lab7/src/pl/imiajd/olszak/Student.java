package pl.imiajd.olszak;

import pl.imiajd.olszak.Person;

public class Student extends Person {
    private String studiesName;  // kierunek

    public Student(String surname, int birthYear, String studiesName){
        super(surname, birthYear);  // wywolujemy konstruktor klasy bazowej
        this.studiesName = studiesName;
    }

    public String getStudiesName() {
        return studiesName;
    }

    public void setStudiesName(String studiesName) {
        this.studiesName = studiesName;
    }

    public String toString(){
        return super.toString() + " studiesName: "+ studiesName;
    }
}
