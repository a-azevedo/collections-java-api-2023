package set;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {

    private final Set<Contact> contactBook;

    public ContactBook(){
        contactBook = new HashSet<>();
    }
    public void addContact(String name, String number){
        contactBook.add(new Contact(name, number));
    }
    public void showContacts(){
        System.out.println(contactBook);
    }
    public Set<Contact> findByName(String name){
        Set<Contact> result = new HashSet<>();
        for(Contact c : contactBook){
            if(c.getName().toLowerCase().startsWith(name.toLowerCase())){
                result.add(c);
            }
        }
        return result;
    }
    public void updateContactNumber(String name, String newNumber){
        for(Contact c : contactBook){
            if(c.getName().equalsIgnoreCase(name)){
                c.setNumber(newNumber);
                break;
            }
        }
        System.out.println(contactBook);
    }

    public static void main(String[] args) {

        ContactBook cb = new ContactBook();

        cb.addContact("Farmácia Vip", "97894-4561");
        cb.addContact("Valeria", "97894-4561");
        cb.addContact("Neymar", "99994-4580");
        cb.addContact("Neymar de Bangu", "99994-4580");

        cb.showContacts();
        System.out.println(cb.findByName("neymar"));

        cb.updateContactNumber("Neymar", "88888-8888");
    }
}
