package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fi = new FileInputStream(br.readLine());
        FileOutputStream fo = new FileOutputStream(br.readLine());
        ArrayList<Byte> arr = new ArrayList<>();

        while(fi.available() > 0){
            int d = fi.read();
            arr.add((byte)d);
        }
        for (Object o : arr)
        {
            System.out.print(o + " ");
        }
        System.out.println();
        for (int i = arr.size() - 1; i >= 0; i--)
        {
            System.out.print(arr.get(i) + " ");
            fo.write(arr.get(i));
        }

        fi.close(); br.close(); fo.close();
    }
}
