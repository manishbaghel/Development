package com.design.pattern.creational.factorymethod.withpattern;

import java.awt.*;

/**
 * Created by manish on 5/9/17.
 */
public interface Car {
    public String getName();
    public void setColor(Color color);
}

class Ferrari implements Car
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
class Mazda implements Car
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