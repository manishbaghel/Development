package com.design.pattern.creational.builder;

/**
 * Created by mb00549 on 5/10/2017.
 */
public interface Insurance
{
}
class PartialInsurance implements Insurance
{
    String name;
    public PartialInsurance(String name)
    {
        this.name = name;
    }
}
class CompleteInsurance implements Insurance
{
    String name;
    public CompleteInsurance(String name)
    {
        this.name = name;
    }
}
