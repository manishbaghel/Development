package com.design.pattern.prototype;

/**
 * Created by manish on 5/9/17.
 */
public interface Insurance
{
    public void setName(String name);
    public Insurance clone() throws CloneNotSupportedException;
}
class PartialInsurance implements Insurance
{
    String name;
    public PartialInsurance(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;

    }
    public Insurance clone() throws CloneNotSupportedException
    {
        PartialInsurance insurance = (PartialInsurance) super.clone();
        insurance.setName(this.name);
        return insurance;
    }
}
class CompleteInsurance implements Insurance
{
    String name;
    public CompleteInsurance(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;

    }
    public Insurance clone() throws CloneNotSupportedException
    {
        CompleteInsurance insurance = (CompleteInsurance) super.clone();
        insurance.setName(this.name);
        return insurance;
    }
}