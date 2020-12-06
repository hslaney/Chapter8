package com.company;

public class Factorial {

    public long calcFactorial(int x){

        long sum = 1;
        for (int y = x; y>0; y--){
            sum *= y;
        }
        return sum;

    }

    public double calcE()
    {
        double e = 1;
        double olde = 0;
        int counter = 1;
        while (e-olde > 0.001){
            olde=e;
            e+= 1.0/(calcFactorial(counter));
            counter++;
        }
        return e;
    }

    public double calcEX(int x){
        double e = 1;
        double olde = 0;
        int counter = 1;
        while (e-olde > 0.001){
            olde=e;
            double y = Math.pow(x, counter);
            e+= y/(calcFactorial(counter));
            counter++;

        }
        return e;

    }


    public static void main (String args[]){
        Factorial f1 = new Factorial();

        for (int x = 1; x<=20 ; x++)
        {
            System.out.println(x + "! = " + f1.calcFactorial(x));
        }

        System.out.println();

        System.out.println("e is " + f1.calcE());
        System.out.printf("rounded : %2.3f \n", f1.calcE());

        System.out.println();

        for (int x=1; x<=5; x++)
        {
            System.out.printf("e^" + x + " = %2.3f \n", f1.calcEX(x));
        }
    }
}

/*
output:
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040
8! = 40320
9! = 362880
10! = 3628800
11! = 39916800
12! = 479001600
13! = 6227020800
14! = 87178291200
15! = 1307674368000
16! = 20922789888000
17! = 355687428096000
18! = 6402373705728000
19! = 121645100408832000
20! = 2432902008176640000

e is 2.7182539682539684
rounded : 2.718

e^1 = 2.718
e^2 = 7.389
e^3 = 20.085
e^4 = 54.598
e^5 = 148.413
 */
