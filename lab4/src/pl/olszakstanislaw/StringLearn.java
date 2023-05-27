package pl.olszakstanislaw;

import java.util.Scanner;

public class StringLearn
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write word: ");
        String s = scan.nextLine();

        System.out.println("Quote: " + s);

//        System.out.print("Write character: ");
//        String s2 = scan.next();

//        System.out.print("Number of occurences character in the word is: ");
//        int result = countChar(s, s2.charAt(0));
//        System.out.println(result);



        String name = scan.next();

        StringBuilder str = new StringBuilder("hahaHA");
        System.out.println(str);

        for(int i=0; i<str.length(); i++){
            System.out.println(Character.isUpperCase(str.charAt(i)));
        }
    }


    public static int countChar(String str, char c){
        int countChar = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c)
                countChar++;
        }
        return countChar;
    }



}
