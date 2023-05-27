package lab11;
import java.util.Collections;

public class PairUtilDemo {
    public static void main(String[] args) {
        Pair<Integer> firstPair = new Pair<>(5, 10);
        Pair<Integer> secPair = PairUtil.swap(firstPair);

        System.out.println("first: " + firstPair.getFirst());
        System.out.println("second: " + firstPair.getSecond());

        System.out.println("After pair swap:");
        System.out.println("first: " + secPair.getFirst());
        System.out.println("second: " + secPair.getSecond());
    }
}
