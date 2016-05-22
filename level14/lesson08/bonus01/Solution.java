package com.javarush.test.level14.lesson08.bonus01;

import java.util.*;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] a = new int[2];
            int b = a[7];
        }catch (Exception e){exceptions.add(e);}
        try
        {
            String s = "a";
            int a = Integer.parseInt(s);
        }catch (Exception e){exceptions.add(e);}
        try
        {
            Solution solution = null;
            solution.getClass();
        }catch (Exception e){exceptions.add(e);}
        try
        {
            Object x = new Integer(0);
            System.out.println((String)x);
        }catch (Exception e){exceptions.add(e);}
        try
        {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        }catch (Exception e){exceptions.add(e);}
        try
        {
            int[] i = new int[-2];
        }catch (Exception e){exceptions.add(e);}
        try
        {
            String s = "waw";
            String a = s.substring(5);
        }catch (Exception e){exceptions.add(e);}
        try
        {
            throw new EmptyStackException();
        }catch (Exception e){
            exceptions.add(e);}
        try
        {
            throw new SecurityException();
        }catch (Exception e){
            exceptions.add(e);}
        //Add your code here
    }
}
