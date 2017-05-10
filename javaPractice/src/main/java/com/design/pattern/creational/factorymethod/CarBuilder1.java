package com.design.pattern.creational.factorymethod;

import java.awt.Color;
/**
 * Created by manish on 5/9/17.
 */

/*Lets list out the problems with these:

The CarBuilder class cannot incorporate change easily. If you get a new car type, you need to change the class to add methods to create the new car type.

The CarBuilder stores reference to the concrete car implementation. That’s not a good design practice.

Lets say you have a new version of Mazda that extends the original vesion. Mazda2 extends Mazda. With this implementation, you would have to change the Builder class.
*/
public class CarBuilder1
{

    Ferrari ferrari;
    Mazda mazda;

    public void buildFerrari(String name)
    {
        ferrari = new Ferrari(name);
    }

    public void buildMazda(String name)
    {
        mazda = new Mazda(name);
    }

    public void paintMazda(Color color)
    {
        mazda.setColor(color);
    }

    public void paintFerrari(Color color)
    {
        ferrari.setColor(color);
    }
}