package com.design.pattern.creational.singleton;

/**
 * Created by mb00549 on 5/10/2017.
 */
/*Instance Created in synchronized accessor method*/

/*A private constructor is used to restrict creation of the object by external clients.
The actual object is created once in the getInstance method.
The getInstance method is synchronized ensuring that only once instance is ever created.
The disadvantage is that synchronized makes it slower.*/
public class SingletonExample3
{
    private static SingletonExample3 singleton;
    private SingletonExample3()
    {
    }
    public static synchronized SingletonExample3 getInstance()
    {
        if (singleton == null)
            singleton = new SingletonExample3();
        return singleton;
    }
}
