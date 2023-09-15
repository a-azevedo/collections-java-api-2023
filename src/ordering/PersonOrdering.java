package ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonOrdering {

    List<Person> persons;

    public PersonOrdering(){
        this.persons = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height){
        persons.add(new Person(name, age, height));
    }

    public List<Person> orderByAge(){
        List<Person> personsByAge = new ArrayList<>(persons);
        Collections.sort(personsByAge);
        return personsByAge;
    }

    public static void main(String[] args) {

        PersonOrdering po = new PersonOrdering();

        po.addPerson("Aelmajan", 35, 1.76d);
        po.addPerson("Luffy", 20, 1.65d);
        po.addPerson("Laerte", 47, 1.74d);

        System.out.println(po.persons);
        System.out.println(po.orderByAge());
    }
}
