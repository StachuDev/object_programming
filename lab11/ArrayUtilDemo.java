package lab11;

import java.time.LocalDate;

public class ArrayUtilDemo {
    public static void main(String[] args) {
//        Pair<Integer>[] pairArray = new Pair[3];  // rezerwójemy 3 miejsca w pamieci
//        pairArray[0] = new Pair<>(1, 2);
//        pairArray[1] = new Pair<>(3, 4);
//        pairArray[2] = new Pair<>(5, 6);
//
//        for(Pair<Integer> pair : pairArray){
//            System.out.println(pair.toString());
//        }

        Integer[] items = new Integer[6];
        items[0] = 1;
        items[1] = 2;
        items[2] = 3;
        items[3] = 3;
        items[4] = 5;
        items[5] = 6;

        boolean isItemsSorted = ArrayUtil.isSorted(items);
        System.out.println("Is items sorted: " + isItemsSorted);

        LocalDate[] itemsDate = new LocalDate[5];
        itemsDate[0] = LocalDate.parse("1959-12-07");
        itemsDate[1] = LocalDate.parse("1959-12-07");
        itemsDate[2] = LocalDate.parse("1962-07-18");
        itemsDate[3] = LocalDate.parse("1979-11-06");
        itemsDate[4] = LocalDate.parse("2005-01-15");

        boolean isItemsDateSorted = ArrayUtil.isSorted(itemsDate);
        System.out.println("Is itemsDate sorted: " + isItemsDateSorted);


        System.out.println(ArrayUtil.binarySearch(items, 2));
        System.out.println(ArrayUtil.binarySearch(items, 6));
        System.out.println(ArrayUtil.binarySearch(itemsDate, LocalDate.parse("1962-07-18")));
        System.out.println(ArrayUtil.binarySearch(itemsDate, LocalDate.parse("1959-12-01")));

        String s = "Adam";
        String s2 = "Stas";
        System.out.println("copareTo: " + s2.compareTo(s));

        for(int i=1; i>1; i++){
            System.out.print("Tak");
        }
    }

}
