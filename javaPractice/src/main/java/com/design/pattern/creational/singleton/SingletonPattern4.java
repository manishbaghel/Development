package com.design.pattern.creational.singleton;

/**
 * Created by mb00549 on 5/10/2017.
 */

/*A private constructor is used to restrict creation of the object by external clients.
This is probably the most performant method of creating the instance.
When a client calls the getInstance the inner static class is loaded and the instance of the singleton created.
Even if multiple clients try to access the getInstance only one object will be created since the inner class is loaded exactly once.*/

public class SingletonPattern4
{
    private SingletonPattern4()
    {
    }
    public static SingletonPattern4 getInstance()
    {
        return SingletonInner.singleton;
    }
    public static class SingletonInner
    {
        static SingletonPattern4 singleton = new SingletonPattern4();
    }
}
