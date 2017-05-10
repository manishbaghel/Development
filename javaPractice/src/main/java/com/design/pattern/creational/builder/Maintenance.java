package com.design.pattern.creational.builder;

/**
 * Created by mb00549 on 5/10/2017.
 */
public interface Maintenance
{
}
class BasicMaintenance implements Maintenance
{
    String name;
    public BasicMaintenance(String name)
    {
        this.name = name;
    }
}
class ComprehensiveMaintenance implements Maintenance
{
    String name;
    public ComprehensiveMaintenance(String name)
    {
        this.name = name;
    }
}
