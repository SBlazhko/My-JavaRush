package com.javarush.test.level14.lesson08.home05;

/**
 * Created by BlazhkoS on 21.05.2016.
 */
public class Monitor implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();
    }
}
