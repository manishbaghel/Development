package com.design.pattern.structural.decorator;

/**
 * Created by mb00549 on 5/10/2017.
 */
public abstract class Profile
{
    String name;
    String email;
    String currentEducation;
    String highestEducation;
    String currentCompany;
    int experience;

    public abstract void printProfile();
}

class StudentProfile extends Profile
{

    public StudentProfile(String name, String email, String currentEducation)
    {
        this.name = name;
        this.email = email;
        this.currentEducation = currentEducation;
    }

    @Override
    public void printProfile()
    {
        System.out.println(name + "," + email + "," + currentEducation);
    }

}

class FresherEmployeeProfile extends Profile
{

    public FresherEmployeeProfile(String name, String email, String highestEducation,
                                  String currentCompany)
    {
        this.name = name;
        this.email = email;
        this.highestEducation = highestEducation;
        this.currentCompany = currentCompany;
    }

    @Override
    public void printProfile()
    {
        System.out.println(name + "," + email + "," + highestEducation + "," + currentCompany);

    }

}

class SeniorEmployeeProfile extends Profile
{

    public SeniorEmployeeProfile(String name, String email, String highestEducation,
                                 int experience, String currentCompany)
    {
        this.name = name;
        this.email = email;
        this.highestEducation = highestEducation;
        this.experience = experience;
        this.currentCompany = currentCompany;
    }

    @Override
    public void printProfile()
    {
        System.out.println(name + "," + email + "," + highestEducation + "," + experience + ","
                + currentCompany);
    }

}
