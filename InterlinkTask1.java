package com.javarush.test;

import java.util.ArrayList;

/**
 * Created by Vikylinka on 13.05.2016.
 */
/* Написать метод на входе которого строка вида "234 12145 2123 46564 12345 1".
На выходе получить обект типа List, каждый елемент списка содержал бы число заключенное медду пробела.
 */
public class InterlinkTask1
{
    public static void main(String[] args)
    {
        String s = "234 12145 2123 46564 12345 1";
        ArrayList<Integer> list = numberList(s);

        for (Integer s1 : list)
        {
            System.out.println(s1);
        }
    }

    public static ArrayList<Integer> numberList(String s){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        StringBuffer stb = new StringBuffer();
        char[] arr = s.toCharArray();
        for (int i = 0; i <arr.length; i++)
        {
            if(arr[i] == ' ')
            {
                str.add(stb.toString());
                stb.delete(0,stb.length());
            }else {
                stb.append(arr[i]);
            }
        }

        for (int i = 0; i < str.size(); i++)
        {
            list.add(Integer.parseInt(str.get(i)));
        }
        list.add(Integer.parseInt(stb.toString()));

        return list;
    }
}
