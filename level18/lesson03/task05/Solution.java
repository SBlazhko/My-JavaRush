package com.javarush.test.level18.lesson03.task05;

import java.io.FileInputStream;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fs = new FileInputStream(sc.nextLine());
        HashSet<Byte> set = new HashSet<>();
        ArrayList<Byte> list = new ArrayList<>();

        while(fs.available() > 0){
            int d = fs.read();
            set.add((byte) d);
        }
        sc.close(); fs.close();
        list.addAll(set);
        Collections.sort(list);
        for (Byte b: list)
        {
            System.out.print(b + " ");
        }
    }
}
