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
        account.setAccountBalance(1231231);
        System.out.println("Account name : " +account.getName());
        System.out.println("Account name : " +account.getEmail());
    }

}
