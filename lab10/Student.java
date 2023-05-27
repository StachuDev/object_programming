package lab10;

import java.time.LocalDate;

public class Student extends Person implements Cloneable, Comparable<Person>{
    double averageGrade;
    public Student(String surname, LocalDate birthDate, double averageGrade){
        super(surname, birthDate);
        this.averageGrade = averageGrade;
    }


}
