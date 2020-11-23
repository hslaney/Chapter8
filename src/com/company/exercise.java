package com.company;

public class exercise {

    public int addsOdds(int n){
        int x=1;
        int sum=0;
        while (x<=n){
            sum+=x;
            x+=2;
        }
        return sum;
    }

    public int howManyYears( double startpop, double endpop){
        int year=0;
        while (startpop<=endpop){
            startpop*=1.13;
            year++;
        }
        return year;
    }

    public void printSum(int n){
        int x=0;
        int sum=0;
        while (x<n){
            x++;
            sum+=x;
        }
        System.out.println(sum);
    }

    public boolean isPerfectSquare(int n){
        int counter = 0;
        int odd = 1;
        int sum = 0;
        double check = Math.sqrt(n);
        while(counter<check){
            sum+=odd;
            odd+=2;
            counter++;
        }
        return sum==n;
    }

    public int sumDigits(int x){
        int sum=0;

        while (x>0){
            int lastNumber = x%10;
            sum+=lastNumber;
            x/=10;
        }
        return sum;
    }



}
