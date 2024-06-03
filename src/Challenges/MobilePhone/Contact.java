package Challenges.MobilePhone;

public class Contact {

    // region FIELDS

    private String name;
    private String phoneNumber;

    // endregion

    // region CONSTRUCTOR

    public  Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // endregion


    // region METHODS

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public  static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

    // endregion


}
