package com.design.patern.structural.decorator;

/**
 * Created by mb00549 on 5/10/2017.
 */
public abstract class ProfilePrinter extends Profile
{
    Profile profile;
}

class CollegeInfoProfilePrinterDecorator extends ProfilePrinter
{

    public CollegeInfoProfilePrinterDecorator(Profile profile)
    {
        this.profile = profile;
    }

    @Override
    public void printProfile()
    {
        profile.printProfile();
        // get college information from college directory
        if (profile.currentEducation != null)
            System.out.println("Enhanced info for " + profile.currentEducation);
    }
}

class CompanyInfoProfilePrinterDecorator extends ProfilePrinter
{


    public CompanyInfoProfilePrinterDecorator(Profile profile)
    {
        this.profile = profile;
    }

    @Override
    public void printProfile()
    {
        profile.printProfile();
        // get company information from company directory
        if (profile.currentCompany != null)
            System.out.println("Enhanced info for " + profile.currentCompany);
    }

}
