package pl.olszakstanislaw;

public class Ex4Tester {
    public static void main(String[] args) {
        Ex4 e=new Ex4();
        e.stanPoczKonta=1000;
        e.saldo=0.06;

        e.przyrost(1);
        e.przyrost(2);
        e.przyrost(3);
    }
}
