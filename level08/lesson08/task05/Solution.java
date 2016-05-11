package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }

    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Blazhko"," Sergey");
        map.put("Poroshenko","Petja");
        map.put("Ivanec"," Sergey");
        map.put("Radko","Ruslan");
        map.put("Petrov","Sergey");
        map.put("Zybchyk","Gala");
        map.put("Lapkin","Sergey");
        map.put("Zadorozniy","Vadim");
        map.put("Suchkov","Olga");
        map.put("Berezhko","Ira");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,String> pair : map.entrySet()){
            String value = pair.getValue();
            list.add(value);
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            String value1 = list.get(i);
            for (int j = 0; j < list.size(); j++)
            {
                String value2 = list.get(j);
                if (value2.equals(value1))
                {
                    count++;
                    if (count >= 2)
                        removeItemFromMapByValue(map, value1);
                }
            }
            count = 0;
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
