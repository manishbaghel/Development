package com.design.pattern.absfactory;

/**
 * Created by manish on 5/9/17.
 */
public class CompleteInsurance implements Insurance
{
    String name;
    public CompleteInsurance(String name)
    {
        this.name = name;
    }
    @Override
    public String getName()
    {
        return name;
    }
}