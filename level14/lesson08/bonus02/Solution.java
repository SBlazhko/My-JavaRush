package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //НОД будем искать с помощю алгоритма Евклида
        //https://ru.wikipedia.org/wiki/Алгоритм_Евклида
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max, min;

        //сначала найдем максимальное и минимальное число
        max = a > b ? a : b;
        min = a < b ? a : b;

        // Реализация алгоритма Евклида
        int nod = min;
        while(max - min != 0)
        {
                while (max > min)
                {
                    max -= min;
                    nod = max;
                }
            max = min;
            min = nod;
        }

        //Вывод на экран НОД
        System.out.println(nod);
    }
}
