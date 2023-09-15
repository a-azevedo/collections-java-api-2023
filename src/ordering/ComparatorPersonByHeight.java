package ordering;

import java.util.Comparator;

public class ComparatorPersonByHeight implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
