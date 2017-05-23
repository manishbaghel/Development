package com.design.pattern.behavioral.strategy;

/**
 * Created by manish on 5/10/17.
 */
public class Car
{

    private String manufacturer;
    private String engineType;
    private String enginePlacement;
    private String bodyConfiguration;
    private String make;

    public Car(String make) {

    }


    public String getEngineType()
    {
        return engineType;
    }

    public void setEngineType(String engineType)
    {
        this.engineType = engineType;
    }

    public void setBodyConfiguration(String bodyConfiguration) {
        this.bodyConfiguration = bodyConfiguration;
    }

    public void setEnginePlacement(String enginePlacement) {
        this.enginePlacement = enginePlacement;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Other getters and setters omitted.

}
