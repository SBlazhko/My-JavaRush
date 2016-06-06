package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fr = new FileInputStream(reader.readLine());

        int min = Integer.MAX_VALUE;
        while (fr.available() > 0){
            int d = fr.read();
            if(d < min) min = d;
        }

        reader.close(); fr.close();
        System.out.println(min);
    }
}
