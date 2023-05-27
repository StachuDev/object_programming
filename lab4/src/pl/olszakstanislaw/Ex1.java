package pl.olszakstanislaw;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

////        Obj A)
//        System.out.println("Obj A)");
//        System.out.print("Write a text: ");
//        String str = scan.next();
//
//        System.out.print("Write a letter c: ");
//        char c = scan.next().charAt(0);
//
//        System.out.print("The number of occurrence the letter c in the text: ");
//        System.out.println(countChar(str, c));

////        Obj B)
//        System.out.println("Obj B)");
//        System.out.print("Write String: ");
//        String str1 = scan.next();
//
//        System.out.print("Write subString: ");
//        String str2 = scan.next();
//
//        System.out.print("The number of occurrence subString in the String: ");
//        System.out.println(countSubStr(str1, str2));

////        Obj C)
//        System.out.println("Obj C)");
//        System.out.print("Write word: ");
//        str = scan.next();
//
//        System.out.println("middle substring: "+ middle(str));
//
//
////        Obj D)
//        System.out.println("Obj D)");
//        System.out.print("Write word: ");
//        str = scan.next();
//
//        System.out.print("The nuber of repeat: ");
//        int repeat = scan.nextInt();
//
//        System.out.println(repeat(str, repeat));
//
//        Obj E)
        System.out.println("Obj E)");
        System.out.print("Write string: ");
        String strE1 = scan.next();

        System.out.print("Write substring: ");
        String strE2 = scan.next();

        System.out.println("A positions of next occurrences substring into a string: ");
        int[] arr = where(strE1, strE2);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("");
//
//
////        Obj F)
//        System.out.println("Obj F)");
//        System.out.print("Write a word: ");
//        str = scan.next();
//
//        System.out.println("word after change: "+change(str));
//
//        System.out.println("Obj G)");
//        System.out.print("Write a number: ");
//        String strG = scan.next();
//        System.out.println("reslut: "+nice(strG));
//
//
//        System.out.println("Obj H)");
//        System.out.print("Write a number: ");
//        String strH = scan.next();
//
//        System.out.print("Write a separator: ");
//        String sep = scan.next();
//
//        System.out.print("Write a gaps size: ");
//        int gaps = scan.nextInt();
//
//        System.out.println("reslut: "+nice2(strH, sep, gaps));
    }


    public static int countChar(String str, char c){
        int countChar = 0;
        if(Character.isLetter(c)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c)
                    countChar++;
            }
        }
        else{
            throw new IllegalArgumentException("Second variable must be a Character type!");
        }
        return countChar;
    }

    public static int countSubStr(String str, String subStr){
        int startSearch = 0;
        int counter = 0;
        int subStringIndex;

        for(int i=0; i<str.length();i++){
            if(str.indexOf(subStr, i) == -1)
                break;
            counter += 1;
        }
//        while((subStringIndex = str.indexOf(subStr, startSearch))!=-1){
//            startSearch = subStringIndex + subStr.length();
//            counter += 1;
//        }
        return counter;
    }

    static String middle(String str){
        int length = str.length();
        String middleStr;

        if(length % 2 == 1) {
            middleStr = Character.toString(str.charAt(length / 2));
        }else{
            char[] resultArr = new char[2];
            resultArr[0]=str.charAt(length/2-1);
            resultArr[1]=str.charAt(length/2);
            middleStr = String.valueOf(resultArr);
        }
        return middleStr;
    }


    static String repeat(String str, int n){
        return str.repeat(Math.max(0, n));
    }

    static int[] where(String str, String subStr){
//        int[] indexArr = new int[str.length/subStr.length];   co jesli ta tablica bedzie za duza ?
        ArrayList<Integer> indexArr = new ArrayList<>();
//        int startSearch = 0;
        int iter=0;
        int subStringIndex;

        while((subStringIndex = str.indexOf(subStr, iter)) != -1){
//            indexArr[iter] = subStringIndex;
            indexArr.add(subStringIndex);
//            startSearch = subStringIndex + subStr.length();
            iter++;
        }

        int size = indexArr.size();
        int[] result = new int[size];
        for(int i=0; i<size; i++){
            result[i] = indexArr.get(i);
        }

        return result;
    }

    static String change(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                result.append(Character.toLowerCase(str.charAt(i)));
            }
            else{
                result.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return result.toString();
    }

    static String nice(String str){
        StringBuffer numbers = new StringBuffer();
        int temp = 1;
        for(int i = str.length()-1; i>=0; i--){
            numbers.append(str.charAt(i));
            if(temp==3){
                numbers.append('\'');
                temp=0;
            }
            temp++;
        }
        return numbers.reverse().toString();
    }

    static String nice2(String str, String sep, int sepGaps){
        StringBuffer numbers = new StringBuffer();
        int temp = 1;
        for(int i = str.length()-1; i>=0; i--){
            numbers.append(str.charAt(i));
            if(temp==sepGaps){
                numbers.append(sep);
                temp=0;
            }
            temp++;
        }
        return numbers.reverse().toString();
    }


}
