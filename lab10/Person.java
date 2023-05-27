package lab10;

import java.time.LocalDate;
import java.util.Objects;


public class Person implements Cloneable, Comparable<Person>{
    private String surname;
    private LocalDate birthDate;

    public Person(String surname, LocalDate birthDate){
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // sprawdzamy czy obiekty maja takie same referencje
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int compareTo(Person other) {  // zwraca -1 jesli this jest leksykograficznie mniejsze niz other
        if (this == other) return 0;
        else if(this.surname.compareTo(other.surname)!= 0)
            return this.surname.compareTo(other.surname);
        else if(this.birthDate.toString().compareTo(other.birthDate.toString()) != 0)
            return this.birthDate.toString().compareTo(other.birthDate.toString());
        else
            return 0;
    }
}
