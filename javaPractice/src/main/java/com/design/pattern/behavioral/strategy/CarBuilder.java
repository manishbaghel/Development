package com.design.pattern.behavioral.strategy;

/**
 * Created by manish on 5/10/17.
 */
public class CarBuilder
{
    public static void main(String[] args)
    {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.buildCar("mazda6-sport");
        carBuilder.buildCar("ferrari-california");
    }

    private Car buildCar(String make)
    {
        Car car = new Car(make);
        if ("mazda6-sport".equals(make)) {
            car.setBodyConfiguration("sedan");
            car.setEnginePlacement("front");
            car.setEngineType("SkyActiv-G");
            car.setManufacturer("Mazda");
        } else if ("ferrari-california".equals(make)) {
            car.setBodyConfiguration("convertible");
            car.setEnginePlacement("front-engine, rear wheel drive");
            car.setEngineType("V8");
            car.setManufacturer("Ferrari");
        }
        return car;
    }
    /*
    *
    The algorithm to build the car is hard coded in the class(context) that uses the algorithm.

    A single class contains all the algorithms. Any change in one of the algorithms would mean changing the class.

    If you need a new algorithm this class needs to be modified.

*/
}


