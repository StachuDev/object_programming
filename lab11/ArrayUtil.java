package lab11;

public class ArrayUtil {
    static <T extends Comparable<? super T>> boolean isSorted(T[] array)
    {
        for(int i=1; i<array.length; i++){
            if(array[i-1].compareTo(array[i]) > 0)
                return false;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> int binarySearch(T[] sortedArray, T key)
    {
        int low=0, high=sortedArray.length-1;
        int index = -1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (sortedArray[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else if (sortedArray[mid].compareTo(key) == 0) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
