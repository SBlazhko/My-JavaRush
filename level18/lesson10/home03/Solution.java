package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream f1 = new FileOutputStream(reader.readLine());
        FileInputStream f2 = new FileInputStream(reader.readLine());
        FileInputStream f3 = new FileInputStream(reader.readLine());

        byte[] arr = new byte[f2.available()];
        byte[] arr2 = new byte[f3.available()];
        ArrayList<Byte> list = new ArrayList<>();
        while(f2.available() > 0 && f3.available() > 0){
            f2.read(arr);
            f3.read(arr2);
        }
        int length = arr.length + arr2.length; int j = 0;
        for (int k = 0; k < arr.length; k++)
        {
            list.add(arr[k]);
        }
        for (int i = arr.length; i < length; i++)
        {
            list.add(arr2[j]);j++;
        }
        for (int i = 0; i < list.size(); i++)
        {
            f1.write(list.get(i));
        }
        reader.close(); f1.close(); f2.close(); f3.close();
    }
}
