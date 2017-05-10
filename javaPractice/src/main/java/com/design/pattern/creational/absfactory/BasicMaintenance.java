package com.design.pattern.creational.absfactory;

/**
 * Created by manish on 5/9/17.
 */
public class BasicMaintenance implements Maintenance
{
    public BasicMaintenance(String name)
    {
        this.name = name;
    }
    String name;
    @Override
    public String getName()
    {
        return name;
    }
}
