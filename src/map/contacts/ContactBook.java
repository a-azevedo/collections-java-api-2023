package map.contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    Map<String, Integer> contactBook;

    public ContactBook() {
        this.contactBook = new HashMap<>();
    }

    public void addContact(String name, Integer phoneNumber){
        contactBook.put(name,phoneNumber);
    }

    public void removeContact(String name){
        if(!contactBook.isEmpty()){
            contactBook.remove(name);
        }
    }

    public void showContacts(){
        System.out.println(contactBook);
    }

    public Integer findByName(String name){
        Integer phoneNumber = null;
        if(!contactBook.isEmpty()){
            phoneNumber = contactBook.get(name);
        }
        return phoneNumber;
    }

    public static void main(String[] args) {

        ContactBook cb = new ContactBook();

        cb.addContact("Aelmajan", 993839836);
        cb.addContact("Maria", 956891245);
        cb.addContact("Valéria", 986951232);

        cb.showContacts();
        cb.removeContact("Maria");
        cb.showContacts();
        System.out.println(cb.findByName("Aelmajan"));
    }
}
