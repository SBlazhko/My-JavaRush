package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        int a;
        for (int i = 0; i < n; i++)
        {
            a = Integer.parseInt(reader.readLine());
            arr[i] = a;
        }
            maximum = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > maximum )
                maximum = arr[i];
        }

        System.out.println(maximum);
    }
}
