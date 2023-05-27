package pl.olszakstanislaw;

import pl.imiajd.olszak.Person;
import pl.imiajd.olszak.Student;
import pl.imiajd.olszak.Teacher;

public class PersonTester {
    public static void main(String[] args) {
        Person filip = new Person("Kowalski", 2003);
        System.out.println("Person test: ");
        System.out.println(filip.toString());
        System.out.println(filip.getBirthYear());
        System.out.println(filip.getSurname());
        filip.setBirthYear(2004);
        System.out.println(filip.getBirthYear());

        System.out.println("Student test: ");
        Student filip2 = new Student("olszak", 1999, "ISI");
        System.out.println(filip2.toString());
        System.out.println(filip2.getBirthYear());
        System.out.println(filip2.getSurname());
        filip2.setBirthYear(2004);
        System.out.println(filip2.getBirthYear());

        System.out.println(filip2.getStudiesName());
        filip2.setStudiesName("IO");
        System.out.println(filip2.getStudiesName());

        System.out.println("Teacher test: ");
        Teacher filip3 = new Teacher("kowalczyk", 1997, 4020);
        System.out.println(filip3.toString());
        System.out.println(filip3.getSalary());
        filip3.setSalary(5050);
        System.out.println(filip3.toString());
    }
}
