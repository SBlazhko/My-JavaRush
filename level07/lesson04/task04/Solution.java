package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] arr = loadArr();
        arr = reverseArr(arr);
        showArr(arr);
    }

    public static int[] loadArr() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int[] reverseArr(int[] arr)
    {
        int[] list = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            int j = 10 - i - 1;
            list[i] = arr[j];
        }
        arr = list;
        return arr;
    }

    public static void showArr(int[] arr){
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
