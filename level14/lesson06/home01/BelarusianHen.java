package com.javarush.test.level14.lesson06.home01;

/**
 * Created by BlazhkoS on 17.05.2016.
 */
public class BelarusianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 25;
    }

    public String getDescription(){

        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
