package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {}

    public class Thread1 extends Thread{
        public void run(){
            while (true){}
        }
    }
    public class Thread2 extends Thread{public void run(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
    }}
    public class Thread3 extends Thread{public void run(){
        try{
            System.out.println("Ура");
            Thread.sleep(500);
        }catch (Exception e){}
    }}
    public class Thread4 extends Thread implements Message{
        public void run(){}

        @Override
        public void showWarning()
        {
            if(isAlive()){interrupt();}
        }
    }
    public class Thread5 extends Thread{

        public void run(){
            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int i = 0;
                while(true){
                    String s = reader.readLine();
                }
            }catch (Exception e){

            }
        }}
}
