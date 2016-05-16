package com.javarush.test;

/**
 * Created by Vikylinka on 13.05.2016.
 */
// Написать вычисление факториала рекурсивным методом
public class InterlinkTask2
{
    public static void main(String[] args)
    {
        long i = 5;
        System.out.println(recursFactorial(i));
        System.out.println(neRecursFactorial(i));

    }

    public static long recursFactorial(long n){

        if(n == 0) return 1;
        return n * recursFactorial(n-1);
    }

    public static long neRecursFactorial(long n){
        int ret = 1;
        for (int i = 1; i <= n ; ++i){ret *= i;}
        return ret;
    }
}
