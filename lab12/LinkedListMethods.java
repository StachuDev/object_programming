package lab12;

import java.util.LinkedList;

public class LinkedListMethods {
//    public static void reduce(LinkedList<String> personnel, int n){
//        for(int i=n-1; i<personnel.size(); i=i+n-1){  // najpierw i jest inicjowane potem sprawdzany warunek
//            personnel.remove(i);                  // a nastepnie wykonywane wnetrze i na sam koniec i=i+n
//        }
//    }

    public static <T> void reduce(LinkedList<T> personnel, int n){
        for(int i=n-1; i<personnel.size(); i=i+n-1){  // najpierw i jest inicjowane potem sprawdzany warunek
            personnel.remove(i);                  // a nastepnie wykonywane wnetrze i na sam koniec i=i+n
        }
    }

    public static <T> void reverse(LinkedList<T> list){
        int iter = 1, size = list.size();
        while(iter < size){
            T right = list.remove(iter);
            list.addFirst(right);
            iter++;
        }
    }

}
