package com.design.pattern.creational.factorymethod.withpattern;

import java.awt.*;

/**
 * Created by manish on 5/9/17.
 */
public class CarBuilderClient
{
    CarBuilder carBuilder;
    Car car;

    public static void main(String[] args)
    {
        CarBuilderClient client = new CarBuilderClient();
        client.execute();
    }

    public void execute()
    {
        setCarBuilder(new FerrariCarBuilder());
        buildAndPaintCar(Color.BLACK);
    }

    private void buildAndPaintCar(Color color)
    {
        car = carBuilder.buildCar();
        carBuilder.paintCar(color);

    }

    public void setCarBuilder(CarBuilder carBuilder)
    {
        this.carBuilder = carBuilder;
    }
}
