package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = newArr();
        ArrayList<String> list2 = shortestString(list);
        showArr(list2);

    }

    public static ArrayList<String> newArr(){
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            list.add(scanner.nextLine());
        }
        return list;
    }

    public static ArrayList<String> shortestString(ArrayList<String> list){
        int j = 0;
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).length() > j)
                j = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).length() < j)
                j = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).length() == j)
                array.add(list.get(i));
        }

        return array;
    }
    public static void showArr(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
