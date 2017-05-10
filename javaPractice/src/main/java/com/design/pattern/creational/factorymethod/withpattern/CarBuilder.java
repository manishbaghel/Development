package com.design.pattern.creational.factorymethod.withpattern;

import java.awt.*;

/**
 * Created by manish on 5/9/17.
 */
public abstract class CarBuilder
{
    Car car;
    public abstract Car buildCar();
    public void paintCar(Color color)
    {
        car.setColor(color);
    }
}
class FerrariCarBuilder extends CarBuilder
{
    @Override
    public Car buildCar()
    {
        car = new Ferrari("Ferrari");
        return car;
    }
}
class MazdaCarBuilder extends CarBuilder
{
    @Override
    public Car buildCar()
    {
        car = new Mazda("Mazda");
        return car;
    }
}
