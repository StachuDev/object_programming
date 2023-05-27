package Egzamin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write number n: ");
        int n = input.nextInt();

        BigInteger result = seedsSum(n);
        System.out.println("Seeds sum equals: "+ result);

        BigDecimal Money = new BigDecimal(17981.5112);
        double interestRate = 0.05;

        BigDecimal capitalAfterYears = levelOfCapital(Money, interestRate, 10);
        System.out.println("Ours capital: " + capitalAfterYears);
    }

    public static BigInteger seedsSum(int n){
        BigInteger sum = BigInteger.ZERO;
        for(int r=0; r<n; r++){
            BigInteger a1 = BigInteger.valueOf(2).pow(r*n);
            BigInteger rowSum = a1.multiply(BigInteger.valueOf(1).subtract(BigInteger.valueOf(2).pow(n)));
            rowSum = rowSum.divide(BigInteger.valueOf(1).subtract(BigInteger.valueOf(2)));
            sum = sum.add(rowSum);
        }
        return sum;
    }

    public static BigDecimal levelOfCapital(final BigDecimal seedMoney, final double interestRate, final int numbYears){
        BigDecimal result = seedMoney;
        int iter = numbYears;
        while(iter>0){
            BigDecimal increase = result.multiply(BigDecimal.valueOf(interestRate));
            result = result.add(increase);
            iter--;
        }

        result = result.setScale(2, RoundingMode.HALF_EVEN);
        return result;
    }
}
