package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try
        {
            putInMap();
            for(Map.Entry<String, Integer> pair : resultMap.entrySet()){
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void putInMap() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
                String s = reader.readLine();
                if(s.equals("exit")){break;}
                new ReadThread(s).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try
            {
                FileInputStream in = new FileInputStream(fileName);
                byte[] buffer = new byte[in.available()];
                in.read(buffer);

                int max = 0;
                int b = 0;
                for (int i = 0; i < buffer.length; i++)
                {
                    int count = 0;
                    for (int j = 0; j < buffer.length; j++)
                    {
                        if(i == j) count++;
                    }
                    if(count > max){ max = count; b = buffer[i];}
                }

                resultMap.put(fileName,b);
                in.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
