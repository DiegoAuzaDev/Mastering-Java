package Challenges.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
    this.myNumber = myNumber;
    myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int oldContactIndex = myContacts.indexOf(oldContact);
        if(oldContactIndex == -1){
            return false;
        } else {
            myContacts.set(oldContactIndex, newContact);
            return true;
        }
    }

    public boolean removeContact(Contact remove){
        int removeContactIndex = myContacts.indexOf(remove);
        if(removeContactIndex == -1){
            return false;
        } else {
            myContacts.remove( remove);
            return true;
        }
    }

    private int findContact(Contact contactToFind){
        return myContacts.indexOf(contactToFind);
    }

    private int findContact(String contactToFind){
        int result = -1;
        for (Contact contact : myContacts){
            if(contact.getName().equals(contactToFind)){
                result =  myContacts.indexOf(contact);
            }
        }
        return  result;
    }

    public Contact queryContact(String name){
        Contact result = null;

        for (Contact contact : myContacts){
            if(contact.getName().equals(name)){
                result =  contact;
            }
        }

        return result;
    }

    public void printContacts(){

        StringBuilder finalString = new StringBuilder();
        finalString.append("Contact List:\n");

        for (int i = 0; i < myContacts.size(); i ++) {
            finalString.append( 1 + i ).append(". ").append(myContacts.get(i).getName()).append(" -> ").append(myContacts.get(i).getPhoneNumber()).append("\n");
        }

        System.out.println(finalString.toString());
    }


}
