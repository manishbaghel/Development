package com.design.pattern.creational.prototype;

/**
 * Created by manish on 5/9/17.
 */
public interface DriveType
{
    public DriveType clone() throws CloneNotSupportedException;
}
class TwoWheelDrive implements DriveType
{
    public DriveType clone() throws CloneNotSupportedException
    {
        return (DriveType) super.clone();
    }
}
class FourWheelDrive implements DriveType
{
    public DriveType clone() throws CloneNotSupportedException
    {
        return (DriveType) super.clone();
    }
}
