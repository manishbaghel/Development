package com.design.pattern.creational.prototype;

/**
 * Created by manish on 5/9/17.
 */
public interface Maintenance extends Cloneable
{
    public void setName(String name);
    public Maintenance clone() throws CloneNotSupportedException;
}
class BasicMaintenance implements Maintenance
{
    String name;
    public BasicMaintenance(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Maintenance clone() throws CloneNotSupportedException
    {
        BasicMaintenance maintenance = (BasicMaintenance) super.clone();
        maintenance.setName(this.name);
        return maintenance;
    }
}
class ComprehensiveMaintenance implements Maintenance
{
    String name;
    public ComprehensiveMaintenance(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Maintenance clone() throws CloneNotSupportedException
    {
        ComprehensiveMaintenance maintenance = (ComprehensiveMaintenance) super.clone();
        maintenance.setName(this.name);
        return maintenance;
    }
}
