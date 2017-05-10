package com.design.pattern.creational.factorymethod;

import java.awt.Color;

/**
 * Created by manish on 5/9/17.
 */
public class Car {
}
class Ferrari
{
    private String name;
    private Color color;

    public Ferrari(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }
}

class Mazda
{

    private String name;
    private Color color;

    public Mazda(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

}