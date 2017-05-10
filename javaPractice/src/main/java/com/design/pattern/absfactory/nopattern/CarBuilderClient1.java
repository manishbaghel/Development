package com.design.pattern.absfactory.nopattern;

import com.design.pattern.absfactory.*;

/**
 * Created by manish on 5/9/17.
 */

//Lets look at how we would typically build cars without the abstract factory pattern

/**
 *
 The client that uses the Car objects also has to know how to create the maintenance
 and insurance objects. If a particular car changes its insurance plan, the client will have to change. Abstract
 Factory pattern can be used here to encapsulate what changes.

 There is no way to ensure that a car uses only a particular type of Insurance plan.
 Abstract Factory pattern can be used here to instantiate a family of products
 together. i.e. we make sure that when we create a Ferrari, we also create a Basic Maintenance plan and a partial
 Insurance plan.
 */

public class CarBuilderClient1
{

    public static void main(String[] args)
    {
        CarBuilderClient1 client = new CarBuilderClient1();
        Car car = client.buildFerrari();
        client.showCar(car);
        Car car2 = client.buildMazda();
        client.showCar(car2);

    }

    private Car buildFerrari()
    {
        Ferrari ferrari = new Ferrari("ferrari");
        BasicMaintenance basicMaintenance = new BasicMaintenance("planA");
        PartialInsurance partialInsurance = new PartialInsurance("plan1");
        ferrari.setInsurance(partialInsurance);
        ferrari.setMaintenance(basicMaintenance);
        return ferrari;
    }

    private Car buildMazda()
    {
        Mazda mazda = new Mazda("mazda");
        ComprehensiveMaintenance comprehensiveMaintenance = new ComprehensiveMaintenance("planB");
        CompleteInsurance completeInsurance = new CompleteInsurance("plan2");
        mazda.setInsurance(completeInsurance);
        mazda.setMaintenance(comprehensiveMaintenance);
        return mazda;
    }

    private void showCar(Car car)
    {
        System.out.println(car.getName() + "," + car.getInsurance() + "," + car.getMaintenance());
    }
}
