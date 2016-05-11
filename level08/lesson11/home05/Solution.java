package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш ко
        changeArr(s);
    }

    public static void changeArr(String s){

        char[] arr = s.toCharArray(); // create arr with string "s"
        arr[0] = Character.toUpperCase(arr[0]); // change first char in arr toUpperCase

        for (int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == ' ')
                arr[i + 1] = Character.toUpperCase(arr[i + 1]); // change every char after space toUpperCase
        }
        System.out.println(arr);
    }
}
