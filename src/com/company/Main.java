package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        exercise e1 = new exercise();

        System.out.println("sum of odds to 5 is " + e1.addsOdds(5));
        System.out.println("sum of odds to 6 is " + e1.addsOdds(6));
        System.out.println("sum of odds to 9 is " + e1.addsOdds(9));
        System.out.println("sum of odds to 1 is " + e1.addsOdds(1));

        System.out.println(e1.howManyYears(111.2, 120) + " year to reach 120 million");
        System.out.println(e1.howManyYears(111.2, 150) + " years to reach 150 million");
        System.out.println(e1.howManyYears(111.2, 170) + " years to reach 170 million");

        e1.printSum(6);
        e1.printSum(8);
        e1.printSum(1);

        System.out.println("25 perfect square: " + e1.isPerfectSquare(25));
        System.out.println("49 perfect square: " + e1.isPerfectSquare(49));
        System.out.println("50 perfect square: " + e1.isPerfectSquare(50));
        System.out.println("60 perfect square: " + e1.isPerfectSquare(60));

        System.out.println("digits of 57634 add to " + e1.sumDigits(57634));
        System.out.println("digits of 6 add to " + e1.sumDigits(6));
        System.out.println("digits of 283455332 add to " + e1.sumDigits(283455332));

    }
}

/*
sum of odds to 5 is 9
sum of odds to 6 is 9
sum of odds to 9 is 25
sum of odds to 1 is 1
1 year to reach 120 million
3 years to reach 150 million
4 years to reach 170 million
21
36
1
25 perfect square: true
49 perfect square: true
50 perfect square: false
60 perfect square: false
digits of 57634 add to 25
digits of 6 add to 6
digits of 283455332 add to 35

 */