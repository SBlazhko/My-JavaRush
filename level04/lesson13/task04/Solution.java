package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String s = "8888888888";
        for (int i = 0; i < 1 ; i++)
        {
            System.out.println(s);
            for (int j = 0; j < 10; j++)
            {
                System.out.println(8);
            }
        }
    }
}
