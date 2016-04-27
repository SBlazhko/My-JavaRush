package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        int j = 0;
        String a = "";
        for (int i = 0; i < 5; i++)
        {
            list.add(scanner.nextLine());
        }

        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).length() > j){
                j = list.get(i).length();
                a = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).length() == j)
                arr.add(list.get(i));
        }

        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
