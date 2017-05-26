package com.design.pattern.behavioral.strategy;

/**
 * Created by manish on 5/10/17.
 */
public interface CarBuilderStrategy
{
    public Car buildCar(String make);
}

 class FerrariBuilderStrategy implements CarBuilderStrategy
{

    @Override
    public Car buildCar(String make)
    {
        Car car = new Car(make);
        car.setBodyConfiguration("convertible");
        car.setEnginePlacement("front-engine, rear wheel drive");
        car.setEngineType("V8");
        car.setManufacturer("Ferrari");
        return car;
    }
}

 class MazdaBuilderStrategy implements CarBuilderStrategy
{

    @Override
    public Car buildCar(String make)
    {
        Car car = new Car(make);
        car.setBodyConfiguration("sedan");
        car.setEnginePlacement("front");
        car.setEngineType("SkyActiv-G");
        car.setManufacturer("Mazda");
        return car;
    }

}
