package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(args[0]);
        HashMap<Byte, Integer> map = new HashMap<>();
        byte[] buffer = new byte[in.available()];
        in.read(buffer); in.close();

        Arrays.sort(buffer);

        for (byte b : buffer)
        {
            int count = 0;
            for (byte b1 : buffer)
            {
                if(b == b1) count++;
            }
            if(!map.containsKey(b)){
                map.put(b,count);
                System.out.println((char) b + " " + count);
            }
        }
    }
}
// My solution
    /*public static void main(String[] args) throws IOException {
        int id = Integer.parseInt(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        byte[] buffer = new byte[in.available()];
        in.read(buffer); in.close(); reader.close();

        String s = "";
        for (int i = 0; i < buffer.length; i++)
        {
            if(buffer[i] == 13){list.add(s); s = ""; i++;}
            else s+=(char)buffer[i];
        }
        printRightString(list, id);
  }

    public static void printRightString(ArrayList<String> list, int id){
        int space = 1;
        for (int i = 0; i < list.size(); i++)
        {
            try
            {
                String s = list.get(i);
                char[] c = s.toCharArray();
                for (int j = 0; j < c.length; j++)
                {
                    if (c[j] == 32)
                    {
                        space = j;
                        break;
                    }
                }
                String s2 = s.substring(0, space);
                if (id == Integer.parseInt(s2))
                {
                    System.out.println(s);
                    break;
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    */