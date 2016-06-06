package com.javarush.test.level18.lesson03.task04;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fs = new FileInputStream(sc.nextLine());
        ArrayList<Byte> list = new ArrayList<>();
        Map<Byte, Integer> map = new HashMap<>();
        while (fs.available() > 0){
            int d = fs.read();
            list.add((byte) d);
        }
        sc.close();fs.close();

        for (int i = 0; i < list.size(); i++)
        {
            int count = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if(i == j)count++;
            }
            map.put(list.get(i),count);
        }
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Byte,Integer> pair : map.entrySet()){
             if(pair.getValue() < min) min = pair.getValue();
        }

        for(Map.Entry<Byte,Integer> pair : map.entrySet()){
             if(pair.getValue().equals(min)) System.out.print(pair.getKey() + " ");
        }
    }
}
