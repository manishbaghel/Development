package com.design.pattern.creational.singleton;

/**
 * Created by mb00549 on 5/10/2017.
 */
/*Instance Created in accessor method*/

/*A private constructor is used to restrict creation of the object by external clients.
The actual object is created once in the getInstance method.
The problem is that if multiple clients access the getInstance method at the same time then there is a chance of multiple objects being created*/
public class SingletonExample
{
    public static SingletonExample singleton;
    private SingletonExample()
    {
    }
    public static SingletonExample getInstance()
    {
        if (singleton == null)
            singleton = new SingletonExample();
        return singleton;
    }
}