package lab12;

import lab10.Person;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {
//        System.out.println("Obj 1: ");
//        LinkedList<String> personnelNames = new LinkedList<>();
//        personnelNames.add("Stanislaw");
//        personnelNames.add("Agnieszka");
//        personnelNames.add("Jozef");
//        personnelNames.add("Filip");
//        personnelNames.add("Andrzej");
//        personnelNames.add("Julia");
//        personnelNames.add("Lucja");
//        personnelNames.add("Aleksander");

//        LinkedListMethods.reduce(personnelNames, 2);
//        System.out.println(personnelNames);

//        LinkedListMethods.reduce(personnelNames, 4);
//        System.out.println(personnelNames);

//        System.out.println("Obj 2: ");
//        LinkedList<Person> group = new LinkedList<>();
//        Person per1 = new Person("Olszak", LocalDate.parse("2001-12-08"));
//        Person per2 = new Person("Zadroga", LocalDate.parse("1991-02-19"));
//        Person per3 = new Person("Kowalski", LocalDate.parse("1981-05-23"));
//        Person per4 = new Person("Andrzejczyk", LocalDate.parse("1976-08-29"));
//        Person per5 = new Person("Duda", LocalDate.parse("2012-09-07"));
//        Person per6 = new Person("Duda", LocalDate.parse("2012-09-14"));
//        group.add(per1);
//        group.add(per2);
//        group.add(per3);
//        group.add(per4);
//        group.add(per5);
//        group.add(per6);
//        Iterator<Person> iter = group.iterator();
//
//        while(iter.hasNext()){
//            System.out.println(iter.next().getSurname());
//        }
//
//        System.out.println(" ");
//        LinkedListMethods.reduce(group, 2);
//        Iterator<Person> iter2 = group.iterator();
//        while(iter2.hasNext()){
//            System.out.println(iter2.next().getSurname());
//        }

//        System.out.println("Obj 3 and 4: ");
//        LinkedList<String> l = new LinkedList<>();
//        l.add("5");
//        l.add("4");
//        l.add("3");
//        l.add("3");
//        l.add("2");
//        l.add("1");
//        System.out.println("l:" + l);
//        LinkedListMethods.reverse(l);
//        System.out.println("l.reversed:" + l);

        System.out.println("Obj 5: ");
        Stack<String> stack = new Stack<>();
        System.out.println("Write sentence: ");
        Scanner input = new Scanner(System.in);
        LinkedList<Stack> stacks = new LinkedList<>();
//        wydaje mi sie, ze trzeba bedzie utwozyc linkedlist zawierajaca stosy
        while(input.hasNext()){
            String word = input.next();
            System.out.print(word + " ");
            while(word.charAt(word.length()-1)!='.'){
                stack.push(word);
            }
            Stack<String> newStack = new Stack<>();
            newStack.addAll(stack);
            stacks.add(newStack);


        }
    }
}
