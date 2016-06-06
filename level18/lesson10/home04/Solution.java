package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine(); String name2 = sc.nextLine();
        FileInputStream in1 = new FileInputStream(name1);
        FileInputStream in2 = new FileInputStream(name2);

        ArrayList<Byte> list = new ArrayList<>();
        byte[] a1 = new byte[in1.available()]; // file 1
        byte[] a2 = new byte[in2.available()]; // file 2
        while(in1.available() > 0 && in2.available() > 0){
            in1.read(a1);
            in2.read(a2);
        }

        for (int i = 0; i < a2.length; i++)
        {
            list.add(a2[i]);
        }
        for (int i = 0; i < a1.length; i++)
        {
            list.add(a1[i]);
        }
        FileOutputStream out = new FileOutputStream(name1);
        for (int i = 0; i < list.size(); i++)
        {
            out.write(list.get(i));
        }

          sc.close(); in1.close(); in2.close(); out.close();
    }
}
