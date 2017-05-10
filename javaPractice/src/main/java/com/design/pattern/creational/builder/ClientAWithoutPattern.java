package com.design.pattern.creational.builder;

/**
 * Created by mb00549 on 5/10/2017.
 */
public class ClientAWithoutPattern
{
    public static void main(String[] args)
    {
        ClientAWithoutPattern client = new ClientAWithoutPattern();
        client.buildFerrari();
        client.buildMazda();
    }

    private void buildFerrari()
    {
        Ferrari ferrari = new Ferrari("ferrari");
        ferrari.setBodyType(new Convertible("Conv1"));
        ferrari.setEngineType(new V4("v4"));
        ferrari.setMaintenance(new BasicMaintenance("basic"));
        ferrari.setInsurance(new CompleteInsurance("insA"));

    }

    private void buildMazda()
    {
        Mazda mazda = new Mazda("mazda");
        mazda.setBodyType(new Sedan("sedan"));
        mazda.setEngineType(new V6("v6"));
        mazda.setMaintenance(new ComprehensiveMaintenance("compA"));
        mazda.setInsurance(new PartialInsurance("insB"));
    }

}
/*
* The client needs to know how to build the cars. If there is a change in the way a car is built then all the clients would need to
* implement the change (If an insurance policy changes then all clients have to change their code).
* The Builder pattern solves the problem by delegating the process of creating the objects in a separate class.
* The Builder class not only creates the objects but also makes sure that they are created in a specified order
*
* We can use the abstract factory pattern, but the number of combinations can increase at a fast place and we would end up with lot of factories.
* We can design a Builder that can take in a list of initialization parameters and create the required objects in a step by step fashion.
* */

