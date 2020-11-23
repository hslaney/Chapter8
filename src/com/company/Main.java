package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        exercise e1 = new exercise();

        System.out.println(e1.addsOdds(5));
        System.out.println(e1.addsOdds(6));
        System.out.println(e1.addsOdds(9));
        System.out.println(e1.addsOdds(1));

        System.out.println(e1.howManyYears(111.2, 120));
        System.out.println(e1.howManyYears(111.2, 150));
        System.out.println(e1.howManyYears(111.2, 170));

        e1.printSum(6);
        e1.printSum(8);

        System.out.println(e1.isPerfectSquare(25));
        System.out.println(e1.isPerfectSquare(49));
        System.out.println(e1.isPerfectSquare(50));
        System.out.println(e1.isPerfectSquare(60));

        System.out.println(e1.sumDigits(57634));
        System.out.println(e1.sumDigits(6));
        System.out.println(e1.sumDigits(283455332));

    }
}
