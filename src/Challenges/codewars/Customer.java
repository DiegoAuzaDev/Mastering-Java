package Challenges.codewars;

public class Customer {

    // region CUSTOMER FIELDS

    final String name;
    final String emailAddress;
    final double creditLimit;

    // endregion

    // region CUSTOMER CONSTRUCTOR

    public Customer (String name, String emailAddress, double creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public Customer (){
        this("unknown customer", "email@email.com", 0.0 );
    }
    public  Customer ( String name, String emailAddress){
        this(name, emailAddress, 0.0);
    }

    // endregion

    // region CUSTOMER GETTERS

    public String getName (){
        return name;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    // endregion


}
