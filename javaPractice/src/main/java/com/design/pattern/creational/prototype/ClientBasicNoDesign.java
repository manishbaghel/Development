package com.design.pattern.creational.prototype;

/**
 * Created by manish on 5/9/17.
 */
public class ClientBasicNoDesign {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ClientBasicNoDesign client = new ClientBasicNoDesign();
        client.buildCar();
    }
    private void buildCar()
    {
        // cars
        FordVehicle fordFiesta = new FordVehicle();
        fordFiesta.setDriveType(new TwoWheelDrive());
        fordFiesta.setInsurance(new PartialInsurance("partialInsurance"));
        fordFiesta.setMaintenance(new BasicMaintenance("basicMaintenance"));

        FordVehicle fordMustang = new FordVehicle();
        fordMustang.setDriveType(new TwoWheelDrive());
        fordMustang.setInsurance(new PartialInsurance("partialInsurance"));
        fordMustang.setMaintenance(new BasicMaintenance("basicMaintenance"));

        // SUVs
        FordVehicle fordEscape = new FordVehicle();
        fordEscape.setDriveType(new FourWheelDrive());
        fordEscape.setInsurance(new CompleteInsurance("completeInsurance"));
        fordEscape.setMaintenance(new ComprehensiveMaintenance("comprehensiveMaintenance"));

        FordVehicle fordExplorer = new FordVehicle();
        fordExplorer.setDriveType(new FourWheelDrive());
        fordExplorer.setInsurance(new CompleteInsurance("completeInsurance"));
        fordExplorer.setMaintenance(new ComprehensiveMaintenance("comprehensiveMaintenance"));
    }
    /*
    *
    The client has to create multiple objects
    The client needs to know the concrete implementation of each type. For example the client needs to know the implementation of each Insurance or Maintenance type
    The client(s) cannot reuse logic. For example all clients have to know that cars have partial insurance and two wheel drive, and has to specify that each time.
*/
}
