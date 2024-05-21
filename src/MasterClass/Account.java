package MasterClass;

public class Account {

    // region ACCOUNT FIELDS

    private int accountNumber;
    private double accountBalance;
    private String name;
    private String email;
    private int phoneNumber;

    // endregion

    // region ACCOUNT CONSTRUCTOR

    public Account (){
        this(0, 0.0 , "Default Name", "Default email", 0);
    }

    public  Account ( int accountNumber, double accountBalance, String name, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, int phoneNumber) {
        this(0, 0.0 , name, email, phoneNumber);
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    // endregion



    // region ACCOUNT GETTERS

    public int getAccountNumber (){
        return accountNumber;
    }

    public double getAccountBalance (){
        return accountBalance;
    }

    public String getName (){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }


    // endregion

    // region ACCOUNT SETTERS

   public void setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;
   }

   public void setAccountBalance ( int accountBalance){
        this.accountBalance = accountBalance;
   }

   public  void setName ( String name){
        this.name = name;
   }

   public void setEmail ( String email){
        this.email = email;
   }

   public void setPhoneNumber (int phoneNumber){
        this.phoneNumber = phoneNumber;
   }

    // endregion

    // region ACCOUNT METHODS

    public double depositingFunds ( int funds){
        this.accountBalance += funds;
        return this.accountBalance;
    }

    public double withdrawingFunds ( int funds){
        if(funds > this.accountBalance){
            return -1;
        } else {
            this.accountBalance -= funds;
        }
        return this.accountBalance;
    }

    // endregion

}
