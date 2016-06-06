package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream f1 = new FileInputStream(rd.readLine());
        FileOutputStream f2 = new FileOutputStream(rd.readLine());
        FileOutputStream f3 = new FileOutputStream(rd.readLine());
        if(f1.available() % 2 == 0)
        {
            int al = f1.available() / 2;
            byte[] fb = new byte[al];
            while (f1.available() > 0)
            {
                if (f1.available() > al)
                {
                    f1.read(fb);
                    f2.write(fb);
                } else
                {
                    f1.read(fb);
                    f3.write(fb);
                }
            }
        }else {
            int a1 = (f1.available() / 2) + 1;
            int a2 = a1 - 1;
            byte[] fb = new byte[a1];
            byte[] fbb = new byte[a2];
            while(f1.available() > 0){
                if (f1.available() > a1)
                {
                    f1.read(fb);
                    f2.write(fb);
                } else
                {
                    f1.read(fbb);
                    f3.write(fbb);
                }
            }
        }
        f1.close(); f2.close(); f3.close(); rd.close();
    }
}
