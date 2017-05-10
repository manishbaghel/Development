package com.design.pattern.creational.builder;

/**
 * Created by mb00549 on 5/10/2017.
 */
public interface Car
{
    public void setInsurance(Insurance insurance);
    public void setMaintenance(Maintenance maintenance);
    public void setBodyType(BodyType bodyType);
    public void setEngineType(EngineType engineType);
}
class Ferrari implements Car
{
    private String name;
    private Maintenance maintenance;
    private Insurance insurance;
    private EngineType engineType;
    private BodyType bodyType;
    public Ferrari(String name)
    {
        this.name = name;
    }
    public void setInsurance(Insurance insurance)
    {
        this.insurance = insurance;
    }
    public void setMaintenance(Maintenance maintenance)
    {
        this.maintenance = maintenance;
    }
    public void setBodyType(BodyType bodyType)
    {
        this.bodyType = bodyType;
    }
    public void setEngineType(EngineType engineType)
    {
        this.engineType = engineType;
    }
}

class Mazda implements Car
{
    private String name;
    private Maintenance maintenance;
    private Insurance insurance;
    private EngineType engineType;
    private BodyType bodyType;
    public Mazda(String name)
    {
        this.name = name;
    }
    public void setInsurance(Insurance insurance)
    {
        this.insurance = insurance;
    }
    public void setMaintenance(Maintenance maintenance)
    {
        this.maintenance = maintenance;
    }
    public void setBodyType(BodyType bodyType)
    {
        this.bodyType = bodyType;
    }
    public void setEngineType(EngineType engineType)
    {
        this.engineType = engineType;
    }
}