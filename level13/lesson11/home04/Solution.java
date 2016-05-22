package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter(reader.readLine());
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String s = reader.readLine();
            if(s.equals("exit")){
                list.add(s);
                for (String s1 : list)
                {
                    fw.write(s1);
                }
                break;
            }
            list.add(s + "\r\n"); //переход на новую строку и возврат каретки
        }

        reader.close(); fw.close();
    }
}
