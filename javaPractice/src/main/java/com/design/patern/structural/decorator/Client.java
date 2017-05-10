package com.design.patern.structural.decorator;

/**
 * Created by mb00549 on 5/10/2017.
 */
public class Client
{
    public static void main(String[] args)
    {
        Profile studentProfile = new StudentProfile("John", "john@stanfordd.com", "Stanford");
        Profile fresherProfile = new FresherEmployeeProfile("Darcy", "Darcy@ibmm.com", "harvard",
                "ibm");
        Profile seniorEmployeeProfile = new SeniorEmployeeProfile("Bill", "bill@microsoftt.com",
                "yale", 8, "microsoft");

        studentProfile = new CollegeInfoProfilePrinterDecorator(studentProfile);
        studentProfile.printProfile();

        fresherProfile = new CollegeInfoProfilePrinterDecorator(
                new CompanyInfoProfilePrinterDecorator(fresherProfile));
        fresherProfile.printProfile();

        seniorEmployeeProfile = new CompanyInfoProfilePrinterDecorator(seniorEmployeeProfile);
        seniorEmployeeProfile.printProfile();

    }
}