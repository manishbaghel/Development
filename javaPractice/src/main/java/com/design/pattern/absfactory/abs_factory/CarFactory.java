package com.design.pattern.absfactory.abs_factory;

import com.design.pattern.absfactory.Car;
import com.design.pattern.absfactory.Insurance;
import com.design.pattern.absfactory.Maintenance;

/**
 * Created by manish on 5/9/17.
 */
public abstract class CarFactory
{
    public abstract Insurance getInsurance(String name);
    public abstract Maintenance getMaintenance(String name);
    public abstract Car getCar(String name);

}
