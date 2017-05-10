package com.design.pattern.creational.absfactory;

/**
 * Created by manish on 5/9/17.
 */
public interface Car {
    public String getName();
    public void setInsurance(Insurance insurance);
    public Insurance getInsurance();
    public void setMaintenance(Maintenance maintenance);
    public Maintenance getMaintenance();
}
