package pl.olszakstanislaw;

public class Ex4 {
    int stanPoczKonta;
    double saldo;

    void przyrost(int year_count){
        int result=stanPoczKonta;
        for(int i=0; i<year_count; i++){
            result*=(1+saldo);
        }
        System.out.println("stan konta po "+year_count+" latach wyniesie: "+result);
    }
}
