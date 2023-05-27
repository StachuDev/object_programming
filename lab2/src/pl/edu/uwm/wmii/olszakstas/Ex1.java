package pl.edu.uwm.wmii.olszakstas;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;


public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write number n in the range of [1,100]: ");
        int n = scanner.nextInt();


        while(n<1 || n>100)
        {
            System.out.println("ERROR! Wrong values.");
            System.out.println("Write number n in the range of [1,100]: ");
            n = scanner.nextInt();
        }

        int[] array = new int[n];

        Random random = new Random();

        for(int i=0; i<n; i++){
            array[i] = random.nextInt(1999)-999;
        }

        for(int i=0; i<n; i++){
            System.out.println(array[i]+"\n");
        }

//      a)
        int oddCount = 0;
        int evenCount = 0;

        for(int i=0; i<n; i++){
            if(array[i]%2==1)
                oddCount += 1;
            else
                evenCount +=1;
        }
        System.out.println("Odd numbers count: "+oddCount+"\nEven numbers count: "+evenCount);

//      b)
        int negativeCount = 0;
        int positiveCount = 0;
        int neutralCount = 0;

        for(int i=0; i<n; i++){
            if(array[i]<0)
                negativeCount += 1;
            else if(array[i]==0)
                neutralCount += 1;
            else
                positiveCount += 1;
        }

        System.out.println("Negative numbers count:"+negativeCount+"\nPositive numbers count:"+positiveCount+
                "\nNeutral numbers count:"+ neutralCount);

//      c)
        /*
        int maximum = array[0];
        int maximumAppear = 1;
        for(int i=1; i<n; i++){
            if(maximum<array[i]){
                maximum = array[i];
                maximumAppear = 1;
            }
            else if(maximum==array[i])
                maximumAppear += 1;
        }
        */
//      Czy w ten sposob:
        int maximum = array[0];
        int maximumAppear = 0;
        for(int i=1; i<n; i++){
            if(maximum<array[i])
                maximum = array[i];
        }
        for(int i=0; i<n; i++){
            if(array[i]==maximum)
                maximumAppear += 1;
        }

        System.out.println("Maximal element of array: "+maximum+"\nNumber of occurrences: "+maximumAppear);

//      d)
        int negativeSum = 0;
        int positiveSum = 0;

        for(int i=1; i<n; i++){
            if(array[i]<0)
                negativeSum += array[i];
            else
                positiveSum += array[i];
        }

        System.out.println("Negative numbers sum:"+negativeSum+"\nPositive numbers sum:"+positiveSum);

//      e)

        int theHighestPositivePart=0;  // bedzie zapamietywac ostatni najdluzszy fragment
        int begIndex=0;  // poczatek dodatniego fragmentu
        int endIndex=0;  // koniec dodatniego fragmentu (zawsze pokazuje nie domkniety koniec przedzialu)

        boolean wasNegative = false;

        for(int i=0; i<n; i++){
            if(array[i]>0){
                if(wasNegative) {
                    begIndex = i;
                    endIndex = i+1;
                    wasNegative = false;
                }
                else
                    endIndex += 1;

            }
            else{
                if(theHighestPositivePart < endIndex-begIndex)
                    theHighestPositivePart = endIndex - begIndex;

                wasNegative = true;
            }
        }

        System.out.println("Length of the highest positive part: "+ theHighestPositivePart);

//      f)
        int[] array2 = new int[n];
        for(int i=1; i<n; i++){
            if(array[i]<0)
                array2[i] = -1;
            else
                array2[i] = 1;
        }

        System.out.println("Modified array: ");
        for(int i=1; i<n; i++){
            System.out.println(array2[i] + ", ");
        }

//      g)
        System.out.println("write left index of range");
        int left = scanner.nextInt();

        while(left<1 || left>=n){
            System.out.println("ERROR! Wrong values.");
            System.out.println("left index must be a number in the range of [1,n). \nWrite again: ");
            left = scanner.nextInt();
        }

        System.out.println("write right index of range");
        int right = scanner.nextInt();
        while(right<1 || right>=n){
            System.out.println("ERROR! Wrong values.");
            System.out.println("right index must be a number in the range of [1,n). \nWrite again: ");
            right = scanner.nextInt();
        }

        // int[] copiedArray = new int[array.length];

        // System.arraycopy(array,0,copiedArray,0,array.length); chyba nie da sie skopiowac array do copiedA.. przed
        // zmiana kolejnosci w array

        System.out.println("Array before reordering: ");
        int[] reorderArray = new int[array.length];
        System.arraycopy(array, 0, reorderArray, 0, array.length);

        for(int i=0; i<n; i++){
            System.out.printf("%s", array[i] + " ");
        }

        for(int i=left; i<=right; i++){
            //int temp = array[n-1-i];
            System.arraycopy(array, i, reorderArray, n-1-i, 1); // chce skopiowac array[i] w miejsce array[n-1-i]
            //array[i] = temp;

        }

        System.out.println("Array after reordering: ");
        for(int i=0; i<n; i++){
            System.out.printf("%s", reorderArray[i]+" ");
        }
    }
}
