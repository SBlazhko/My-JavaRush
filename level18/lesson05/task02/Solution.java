package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        //ascii ',' = 44;

        Scanner sc = new Scanner(System.in);
        FileInputStream fs = new FileInputStream(sc.nextLine());

        int count = 0;
        while (fs.available() > 0){
            int d = fs.read();
            if(d == 44) count++;
        }

        System.out.println(count);
        sc.close();fs.close();
    }
}
