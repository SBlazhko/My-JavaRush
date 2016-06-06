package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream(args[0]);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alphaArr = alphabet.toCharArray();
        int count = 0;
        while(in.available()>0){
            int d = in.read();
            for (int i = 0; i < alphaArr.length; i++)
            {
                if((char)d == alphaArr[i]){count++;}
            }
        }
        System.out.println(count);
        in.close();

    }
}
