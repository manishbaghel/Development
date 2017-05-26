package com.design.pattern.structural.facade;

/**
 * Created by manish on 5/10/17.
 */
public class AccountDetailsVerifier
{

    public boolean isSSNValid(String ssn){
        // verify ssn
        return true;
    }

    public boolean isAccountPresent(String name, String ssn){
        // verify address;
        return true;
    }
}
