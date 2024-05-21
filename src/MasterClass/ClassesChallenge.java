package MasterClass;


public class ClassesChallenge {

    public static void main(String[] args) {

        var account = new Account();
        System.out.println("Account name : " +account.getName());
        System.out.println("Account name : " +account.getEmail());
        System.out.println("Account balance : " +account.getAccountBalance());

        // setting name and email to the account

        account.setName("Diego Luis");
        account.setEmail("email@email.com");
        account.setAccountBalance(1);
        System.out.println("Account name : " +account.getName());
        System.out.println("Account name : " +account.getEmail());
        System.out.println("Account balance : " +account.getAccountBalance());

        // updating account balance

       System.out.println( "Total account balance - DEPOSIT " + account.depositingFunds(1_000_000));
       System.out.println("Total account balance - WITHDRAW " + account.withdrawingFunds(1_000));

       System.out.println("Invalid withdraw amount - INVALID " + account.withdrawingFunds(1_000_000));

    }

}
