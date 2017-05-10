package com.design.pattern.creational.builder;

/**
 * Created by mb00549 on 5/10/2017.
 */
public interface EngineType
{
}
class V4 implements EngineType
{
    String name;
    public V4(String name)
    {
        this.name = name;
    }
}
class V6 implements EngineType
{
    String name;
    public V6(String name)
    {
        this.name = name;
    }
}
