package lab10;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//public class CollectionStreams {
//
//    List<Person> group = new ArrayList<>();
//
//    public void setUp(){
//        Person per1 = new Person("Olszak", LocalDate.parse("2001-12-08"));
//        Person per2 = new Person("Zadroga", LocalDate.parse("1991-02-19"));
//        Person per3 = new Person("Kowalski", LocalDate.parse("1981-05-23"));
//        Person per4 = new Person("Andrzejczyk", LocalDate.parse("1976-08-29"));
//        Person per5 = new Person("Duda", LocalDate.parse("2012-09-07"));
//        Person per6 = new Person("Duda", LocalDate.parse("2012-09-14"));
//        this.group.add(per1);
//        this.group.add(per2);
//        this.group.add(per3);
//        this.group.add(per4);
//        this.group.add(per5);
//        this.group.add(per6);
//    }
//
//    public void firstStream(){
//        group.stream()
//                .forEach(element -> System.out.println(element));
//    }
//
//    public static void main(String[] args) {
//        List<Person> newList = ArrayList<>(new CollectionStreams().group);
//        Iterator iter = newList.iterator();
//
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//    }
//}
