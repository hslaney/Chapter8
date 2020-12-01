package com.company;

public class Factorial {

    public int calcFactorial(int x){

//        int sum=1;
//        for (int y = x; y>0; y--){
//            sum *= y;
//        }
//        return sum;

        int sum =1;
        while (x>0){
            sum *=x;
            x--;
        }
        return sum;

    }











    public static void main (String args[]){
        Factorial f1 = new Factorial();

        System.out.println(f1.calcFactorial(1));
        System.out.println(f1.calcFactorial(2));
        System.out.println(f1.calcFactorial(3));
        System.out.println(f1.calcFactorial(4));
        System.out.println(f1.calcFactorial(5));
        System.out.println(f1.calcFactorial(6));
        System.out.println(f1.calcFactorial(7));
        System.out.println(f1.calcFactorial(8));
        System.out.println(f1.calcFactorial(9));
        System.out.println(f1.calcFactorial(10));
        System.out.println(f1.calcFactorial(20));
    }
}
