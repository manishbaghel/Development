package com.design.pattern.creational.builder;

/**
 * Created by mb00549 on 5/10/2017.
 */

/*
*  The CarBuilder is the builder that is the heart of this pattern. Its job is to create the objects that form part of the car.
*  Our Builder has two methods, or two ways to instantiate car objects.
*  The first method called buildCar creates the objects using a predefined sequence and type.
*  The second method is a parameterized builder. We pass in multiple Strings.
*  Each string defines the type of object to be created. For example, “bodyType-sedan-mazdasedan” creates a BodyType Sedan named mazdasedan.
*  The advantage of the parameterised builder is that the client can specify the concrete type to be created and also the sequence in which they should be created*/
public interface CarBuilder
{
    public Car buildCar();
    public Car buildCarParameterized(String... initializers);
}
class FerrariCarBuilder implements CarBuilder
{
    @Override
    public Car buildCar()
    {
        Ferrari ferrari = new Ferrari("ferrari");
        ferrari.setBodyType(new Convertible("Conv1"));
        ferrari.setEngineType(new V4("v4"));
        ferrari.setMaintenance(new BasicMaintenance("basic"));
        ferrari.setInsurance(new CompleteInsurance("insA"));
        return ferrari;
    }
    @Override
    public Car buildCarParameterized(String... initializers)
    {
        return null;
    }
}

class MazdaCarBuilder implements CarBuilder
{
    @Override
    public Car buildCar()
    {
        Mazda mazda = new Mazda("mazda");
        mazda.setBodyType(new Sedan("sedan"));
        mazda.setEngineType(new V6("v6"));
        mazda.setMaintenance(new ComprehensiveMaintenance("compA"));
        mazda.setInsurance(new PartialInsurance("insB"));
        return mazda;
    }
    /**
     * This method shows a partially implemented build method that uses
     * parameters to build objects
     *
     * @param initializers
     * @return
     */
    public Car buildCarParameterized(String... initializers)
    {
        Mazda mazda = new Mazda("mazda");
        for (String initializer : initializers) {
            String[] tokens = initializer.split("-");
            if (tokens[0].equals("bodyType")) {
                if (tokens[1].equals("sedan"))
                    mazda.setBodyType(new Sedan(tokens[2]));
                else if (tokens[1].equals("convertible"))
                    mazda.setBodyType(new Convertible(tokens[2]));
            } else if (tokens[0].equals("engineType")) {
                // code for engine type
            }
            // code for maintenance and insurance
        }
        return mazda;
    }
}