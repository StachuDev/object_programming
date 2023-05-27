package Egzamin;

import java.util.*;

public class Lab12Zad8 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Ala");
        strings.add("Romek");
        strings.add("Jozek");
        strings.add("Bolek");
        System.out.println("ArrayList: ");
        print(strings);

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(9);
        set.add(101);
        set.add(100);
        set.add(11);
        set.add(12);

        System.out.println("set: ");
        print(set);
    }
//    public static <T> void print(Collection<T> obj){
    public static <T extends Iterable<E>, E> void print(T obj){ // T - to typ kolekcji a nie jej elementow
        Iterator<E> iter = obj.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next() + ", ");
        }
    }
}
