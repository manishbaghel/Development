package com.design.pattern.creational.builder;

/**
 * Created by mb00549 on 5/10/2017.
 */
/*
* The client does not need to know which concrete implementations to create or the order in which they are created.
* The pattern encapsulates the object creation and order from the client.*/

/*New Builders can be added without modifying any existing classes. Current Builders can be modified. The clients do not have to change any code.*/

/*The design codes to interfaces and not to concrete implementations. The product (Car) and the builder(CarBuilder) hierarchy can be evolved independently*/
public class CarBuilderClient
{
    static CarBuilder builder;
    static Car car;
    public static void main(String[] args)
    {
        CarBuilderClient client = new CarBuilderClient();
        builder = new FerrariCarBuilder();
        client.buildCar(builder);
        builder = new MazdaCarBuilder();
        client.buildCarParameterized(builder, "bodyType-sedan-mazdasedan", "engineType-V4-mazdav4");
    }
    private void buildCar(CarBuilder builder)
    {
        car = builder.buildCar();
    }
    private void buildCarParameterized(CarBuilder builder, String... parameters)
    {
        builder.buildCarParameterized(parameters);
    }
}
