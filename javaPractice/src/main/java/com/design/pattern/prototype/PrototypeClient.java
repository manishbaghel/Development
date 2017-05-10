package com.design.pattern.prototype;

/**
 * Created by manish on 5/10/17.
 */
public class PrototypeClient
{
    PrototypeManager manager;
    public static void main(String[] args) throws CloneNotSupportedException
    {
        PrototypeClient client = new PrototypeClient();
        client.buildCar();
    }
    public void buildCar() throws CloneNotSupportedException
    {
        manager = new PrototypeManager();
        FordVehicle fordFiesta = manager.getVehicle("fordCar");
        FordVehicle fordMustang = manager.getVehicle("fordCar");
        FordVehicle fordEscape = manager.getVehicle("fordSUV");
        FordVehicle fordExplorer = manager.getVehicle("fordSUV");
    }
}