package com.design.pattern.creational.singleton;

/**
 * Created by mb00549 on 5/10/2017.
 */

/*Instance Created in static block*/

/*A private constructor is used to restrict creation of the object by external clients.
The instance is created when the class loads.
There is therefore only one instance ever created, however the disadvantage is that the application startup is delayed.*/
public class SingletonExample2
{
    public static SingletonExample2 singleton;
    static {
        singleton = new SingletonExample2();
    }
    private SingletonExample2()
    {
    }
}
