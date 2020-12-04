package com.company;

public class Factorial {

    public int calcFactorial(int x){

        int sum=1;
        for (int y = x; y>0; y--){
            sum *= y;
        }
        return sum;

//        int sum = 1;
//        while (x>0){
//            sum *=x;
//            x--;
//        }
//        return sum;

    }

    public void calcE()
    {
        double e = 1;
        double old = 0;
        int counter = 1;
        while (e-old > 0.001){
            old=e;
            e+= 1.0/(calcFactorial(counter));
            counter++;
            System.out.println("e:" + e + "    old:" + old);
        }
    }











    public static void main (String args[]){
        Factorial f1 = new Factorial();

//        System.out.println(f1.calcFactorial(1));
//        System.out.println(f1.calcFactorial(2));
//        System.out.println(f1.calcFactorial(3));
//        System.out.println(f1.calcFactorial(4));
//        System.out.println(f1.calcFactorial(5));
//        System.out.println(f1.calcFactorial(6));
//        System.out.println(f1.calcFactorial(7));
//        System.out.println(f1.calcFactorial(8));
//        System.out.println(f1.calcFactorial(9));
//        System.out.println(f1.calcFactorial(10));
//        System.out.println(f1.calcFactorial(19));
//        System.out.println(f1.calcFactorial(20));

        f1.calcE();



    }
}
