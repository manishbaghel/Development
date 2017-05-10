package com.design.pattern.creational.absfactory;

/**
 * Created by manish on 5/9/17.
 */
public class PartialInsurance implements Insurance
{
    String name;
    public PartialInsurance(String name)
    {
        this.name = name;
    }
    @Override
    public String getName()
    {
        return name;
    }
}