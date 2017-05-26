package com.design.pattern.structural.facade;

/**
 * Created by manish on 5/10/17.
 */
public class AccountFacade
{

    private AccountDetailsVerifier verifier;
    private AccountGenerator generator;

    public Account createAccount(String name, String ssn)
    {
        verifier = new AccountDetailsVerifier();
        if (!verifier.isSSNValid(ssn))
            return null;
        // check if account for this person (name, ssn combination) is present
        if (verifier.isAccountPresent(name, ssn))
            return null;
        generator = new AccountGenerator();
        String account_no = generator.generateAccountNumber(name, ssn);
        Account account = generator.createAccount(name, account_no, ssn);
        return account;
    }
/*
* Note that the intent of this pattern is to only hide one or more interfaces to make them easier to use and the client can still control the
* business logic by passing in appropriate parameters
* */
}
class AccountClientUsingFacade
{

    static AccountFacade facade;

    public static void main(String[] args)
    {
        facade = new AccountFacade();
        String name = args[0];
        String ssn = args[1];

        Account account = facade.createAccount(name, ssn);
        if (account == null)
            System.out.println("account creation failed");
    }
}
