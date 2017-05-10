package com.design.pattern.absfactory.abs_factory;

import com.design.pattern.absfactory.*;

/**
 * Created by manish on 5/9/17.
 */
public class FerrariCarFactory extends CarFactory
{
    @Override
    public Insurance getInsurance(String name)
    {
        return new PartialInsurance(name);
    }
    @Override
    public Maintenance getMaintenance(String name)
    {
        return new BasicMaintenance(name);
    }
    @Override
    public Car getCar(String name)
    {
        return new Ferrari(name);
    }
}
