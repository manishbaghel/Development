package com.design.pattern.structural.decorator;

/**
 * Created by mb00549 on 5/10/2017.
 */

/*
* Decorator pattern adds functionality to an object without modifying it.
*
* Decorator pattern can be used when extending classes creates a profusion of classes, i.e. a lot of classes have to be created to cover all the use cases.
* The fact that decorators can be chained can be useful in achieving a high number of combinations of functionalities.
*
* The decorators have to implement the interface that they are decorating and hence it would be good to keep those interfaces light weight.
* */
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
