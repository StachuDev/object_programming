package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

	    String str = "abcdad";
	    String s2 = "abc";

//	    char[] tab = str.toCharArray();


//	    for(int i=0; i<str.length(); i++){
//	        System.out.print(tab[i]);
//        }
//        System.out.println("tab[2]: " + tab[2]);


        int index = str.indexOf(s2, 0);

        System.out.println("index: " + index);



    }

    public static void generuj(int[] tab, int l, int right){
        Random r = new Random();
        for(int i=0; i<tab.length; i++){
            tab[i] = r.nextInt(right-l+1)+l;
        }
    }


//    public static int countSubStr(String str, String subStr){
//        while(str)
//    }
}
