package pl.olszakstanislaw;

import pl.imiajd.olszak.Address;

public class AdressTester {
    public static void main(String[] args) {
//        mozna porownywac chary
//        char s1 = 'a';
//        char s2 = 'd';
//        Boolean isFirst = s1 < s2;

        Address address1 = new Address("Sw. Wojciecha", 10, 1, "Pisz","14-200");
        Address address2 = new Address("H. Sienkiewicza", 5, "Olcza","14-200");

        System.out.println("PRINT TEST: ");
        System.out.println("address1: ");
        address1.print();

        System.out.println("");
        System.out.println("address2: ");
        address2.print();

        System.out.println("");
        System.out.println("BEFORE TEST");
        System.out.println("if address1 is before address2: " + address1.before(address2));


    }
}
