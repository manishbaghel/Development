package com.design.pattern.creational.factorymethod;
import java.awt.Color;
/**
 * Created by manish on 5/9/17.
 */
public class CarBuilderClient1
{
    public static void main(String[] args)
    {
        CarBuilder1 builder = new CarBuilder1();
        builder.buildFerrari("Ferrari488");
        builder.paintFerrari(Color.red);
        builder.buildMazda("mazdamx5");
        builder.paintMazda(Color.green);
    }
}
