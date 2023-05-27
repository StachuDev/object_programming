package lab11;
import java.util.Collections;

public class PairDemo1
{
    public static void main(String[] args)
    {
        System.out.println("Obj 1");
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        // Pair<String> mm = ArrayAlg.<String>minmax(words);
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        System.out.println("After pair swap:");
        mm.swap();
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());


        System.out.println("\nObj 2");


        System.out.println("\nObj 2");
    }
}

