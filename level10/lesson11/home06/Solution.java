package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int weight;
        private int height;
        private boolean sex;
        private String nationality;

        public Human(int height, int weight, boolean sex)
        {
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, String nationality, boolean sex)
        {

            this.name = name;
            this.nationality = nationality;
            this.sex = sex;
        }

        public Human(String nationality, boolean sex)
        {

            this.nationality = nationality;
            this.sex = sex;
        }

        public Human(String name, int age, int weight, int height, boolean sex, String nationality)
        {

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
            this.nationality = nationality;
        }

        public Human(String name, int age, boolean sex, String nationality)
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.nationality = nationality;
        }

        public Human(boolean sex, int height, int weight, int age)
        {
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.age = age;
        }

        public Human(int age, int height, int weight)
        {

            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex)
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age)
        {

            this.name = name;
            this.age = age;
        }

        public Human(String name)
        {

            this.name = name;
        }
    }
}
