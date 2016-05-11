package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> kidsHaveNotKids = new ArrayList<>();
        Human son1 = new Human("son1", true, 10, kidsHaveNotKids);
        Human son2 = new Human("son2", true, 9, kidsHaveNotKids);
        Human dotch = new Human("dotch", false, 6, kidsHaveNotKids);
        ArrayList<Human> kids = new ArrayList<>();
        kids.add(son1);kids.add(son2);kids.add(dotch);

        Human mother = new Human("Mother", false, 35, kids);
        Human father = new Human("Father", true, 38, kids);
        ArrayList<Human> children = new ArrayList<>();
        children.add(father); children.add(mother);

        Human ded1 = new Human("ded1", true, 60, children);
        Human bab1 = new Human("bab1", true, 58, children);
        Human ded2 = new Human("ded2", true, 62, children);
        Human bab2 = new Human("bab2", true, 60, children);
        ArrayList<Human> parents = new ArrayList<>();
        parents.add(ded1);parents.add(bab1);parents.add(ded2);parents.add(bab2);

        ArrayList<Human> human = new ArrayList<>();
        human.addAll(parents);human.addAll(children);human.addAll(kids);

        for (Object o : human)
        {
            System.out.println(o.toString());
        }
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
