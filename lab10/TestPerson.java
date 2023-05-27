package lab10;

import java.time.LocalDate;
import java.util.*;

public class TestPerson {

    public static void main(String[] args) {
        ArrayList<Person> group = new ArrayList<>();
        Person per1 = new Person("Olszak", LocalDate.parse("2001-12-08"));
        Person per2 = new Person("Zadroga", LocalDate.parse("1991-02-19"));
        Person per3 = new Person("Kowalski", LocalDate.parse("1981-05-23"));
        Person per4 = new Person("Andrzejczyk", LocalDate.parse("1976-08-29"));
        Person per5 = new Person("Duda", LocalDate.parse("2012-09-07"));
        Person per6 = new Person("Duda", LocalDate.parse("2012-09-14"));
        group.add(per1);
        group.add(per2);
        group.add(per3);
        group.add(per4);
        group.add(per5);
        group.add(per6);
        Iterator<Person> iter = group.iterator();  // specjalny objekt ktory porusza sie po kolekcji

//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//        Collections.sort(group); //korzysta z mojej funkcji compareTo dla klasy Person
//
//        System.out.println(" ");
//        iter = group.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }


    }
}
