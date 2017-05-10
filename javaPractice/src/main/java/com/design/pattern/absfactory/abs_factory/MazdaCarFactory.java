package com.design.pattern.absfactory.abs_factory;

import com.design.pattern.absfactory.*;

/**
 * Created by manish on 5/9/17.
 */
public class MazdaCarFactory extends CarFactory
{
    @Override
    public Insurance getInsurance(String name)
    {
        return new CompleteInsurance(name);
    }
    @Override
    public Maintenance getMaintenance(String name)
    {
        return new ComprehensiveMaintenance(name);
    }
    @Override
    public Car getCar(String name)
    {
        return new Mazda(name);
    }
}