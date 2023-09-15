package ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderNumber{

    List<Integer> numbers;

    public OrderNumber() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public List<Integer> ascendingOrder(){
        List<Integer> ordenedNumbers = new ArrayList<>(numbers);
        Collections.sort(ordenedNumbers);
        return ordenedNumbers;
    }

    public List<Integer> descendingOrder(){
        List<Integer> ron = new ArrayList<>(numbers);
        Collections.sort(ron, Collections.reverseOrder());
        return ron;
    }

    public static void main(String[] args) {

        OrderNumber orderNumber = new OrderNumber();

        orderNumber.addNumber(5);
        orderNumber.addNumber(4);
        orderNumber.addNumber(1);
        orderNumber.addNumber(2);
        orderNumber.addNumber(3);

        System.out.println(orderNumber.ascendingOrder());
        System.out.println(orderNumber.descendingOrder());

    }

}
