package com.design.pattern.creational.builder;

/**
 * Created by mb00549 on 5/10/2017.
 */
public interface BodyType
{
}
class Convertible implements BodyType
{
    String name;
    public Convertible(String name)
    {
        this.name = name;
    }
}
class Sedan implements BodyType
{
    String name;
    public Sedan(String name)
    {
        this.name = name;
    }
}