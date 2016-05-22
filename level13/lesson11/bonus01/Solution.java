package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        Scanner scf = new Scanner(new FileReader(sc.nextLine()));
        ArrayList<Integer> list = new ArrayList<>();

        while(scf.hasNext()){
            int data = scf.nextInt();
            if(data %2 == 0){list.add(data);}
        }
        Collections.sort(list);
        for (Object o : list)
        {
            System.out.println(o);
        }

    }
}
