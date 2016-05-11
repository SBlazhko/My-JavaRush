package com.javarush.test.level08.lesson08.task04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String,Date> pair : map.entrySet())
        {
            String key = pair.getKey();
            Date value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Blazhko", new Date("Feb 18 1993"));
        map.put("Zubchuk", new Date("JULY 22 1982"));
        map.put("Rivs", new Date("Feb 2 1992"));
        map.put("Deph", new Date("May 13 2002"));
        map.put("Stall", new Date("JUNE 1 1980"));
        map.put("Biluk", new Date("Feb 18 1993"));
        map.put("Usatenko", new Date("JULY 22 1982"));
        map.put("Lenin", new Date("Feb 2 1992"));
        map.put("Stalin", new Date("May 13 2002"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Date> pair = iter.next();
            int month = pair.getValue().getMonth();
            if(month == 5 || month == 6 || month == 7)
                iter.remove();
        }
    }
}
