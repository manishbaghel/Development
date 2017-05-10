package com.design.pattern.absfactory.abs_factory;

import com.design.pattern.absfactory.Car;

/**
 * Created by manish on 5/9/17.
 */

/*
We have removed the object creation process from the client and put it in a separate factory. The factory
creates the group of related objects and is abstract.

It is extended by concrete factories to create the actual products.

The client holds a reference to the abstract factory and can access the products through its interfaces but
not the concrete implementations. The factory can be replaced without modifying the client.
*/

/*The PrototypeClient contains a reference to an abstract factory. The concrete
factory is injected into the client. All related objects are created by the concrete factory.*/

/*New Concrete Factories can be created or extended to create different class
of products.*/

/*The client has no idea which concrete product is created. It just works
with the reference to the Product interface.*/

public class Client
{
    CarFactory factory;
    public static void main(String[] args)
    {
        Client client = new Client();
        client.setFactory(new MazdaCarFactory());
        client.buildCar("mazda", "Insurance1", "Maintenance1");
    }
    private void buildCar(String name, String insuranceName, String maintenanceName)
    {
        Car car = factory.getCar(name);
        car.setInsurance(factory.getInsurance(insuranceName));
        car.setMaintenance(factory.getMaintenance(maintenanceName));
    }
    public void setFactory(CarFactory factory)
    {
        this.factory = factory;
    }
}

/*
What are the shortcomings of the abstract factor pattern?

The family of related products have to be created together. if you need a different maintenance plan for
Ferrari, you need to create a new concrete factory or extend the existing one.

The pattern requires creation of more classes, and will create a profusion of classes. For simple systems
this may not be required.

Except for the couple of situations described above, the abstract factory pattern is widely used and can make
the code more robust and adaptable to changes.
*/