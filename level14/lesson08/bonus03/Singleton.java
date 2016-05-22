package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by BlazhkoS on 22.05.2016.
 */
public class Singleton
{
    private Singleton(){}
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){return instance;}
}
