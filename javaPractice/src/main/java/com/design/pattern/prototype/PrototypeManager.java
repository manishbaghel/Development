package com.design.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manish on 5/10/17.
 */
public class PrototypeManager
{
    private Insurance partialInsurance;
    private Insurance completeInsurance;
    private Maintenance basicMaintenance;
    private Maintenance comprehensiveMaintenance;
    private DriveType twoWheelDrive;
    private DriveType fourWheelDrive;
    private Map<String , FordVehicle> fordRegistry = new HashMap<>();
    public PrototypeManager()
    {
        initialize();
        initializeVehicles();
    }
    private void initialize()
    {
        partialInsurance = new PartialInsurance("partialInsurance");
        completeInsurance = new CompleteInsurance("completeInsurance");
        basicMaintenance = new BasicMaintenance("basicMaintenance");
        comprehensiveMaintenance = new ComprehensiveMaintenance("comprehensiveMaintenance");
        twoWheelDrive = new TwoWheelDrive();
        fourWheelDrive = new FourWheelDrive();
    }
    private void initializeVehicles()
    {
        FordVehicle fordCar = new FordVehicle();
        fordCar.setDriveType(twoWheelDrive);
        fordCar.setInsurance(partialInsurance);
        fordCar.setMaintenance(basicMaintenance);
        fordRegistry.put("fordCar", fordCar);

        FordVehicle fordSUV = new FordVehicle();
        fordSUV.setDriveType(fourWheelDrive);
        fordSUV.setInsurance(completeInsurance);
        fordSUV.setMaintenance(comprehensiveMaintenance);
        fordRegistry.put("fordSUV", fordSUV);
    }
    public FordVehicle getVehicle(String key) throws CloneNotSupportedException
    {
        FordVehicle vehicle = fordRegistry.get(key);
        return vehicle.clone();
    }
    /*The prototype manager creates the Insurance, Maintenance and Drive Type objects. It also creates a base car and SUV object.
    When the client requests a car object, the prototype manager retrieves one from the repository and returns a clone.*/

    /*The client can build upon the basic car and SUV objects. It does not have to know that all cars have two wheel drive
    or all SUVs have a comprehensive maintenance. The client does not have to know about the concrete implementations and
    codes only to references.*/

    /*Unlike the Abstract factory, there is no profusion of classes here. A single prototype manager can take care of multiple product combinations.*/
}
