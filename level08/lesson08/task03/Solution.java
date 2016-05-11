package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int nameCount = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if(value.equals(name))
                nameCount++;
        }
        return nameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int lastNameCount = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if(key.equals(lastName))
                lastNameCount++;
        }
        return lastNameCount;
    }
}
