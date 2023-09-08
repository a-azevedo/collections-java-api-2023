package math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.valueOf;

public class Sum {
    List<Integer> numbers;

    public Sum() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public int evaluateSum(List<Integer> numbers){
        int total = 0;
        for(Integer number : numbers){
            total += number;
        }
        return total;
    }

    public int FindBiggestNumber(){
        int biggest = 0;
        for (Integer i : numbers){
            if(i > biggest){
                biggest = i;
            }
        }
        return biggest;
    }

    public int FindSmallerNumber(){
        return Collections.min(numbers);
    }

    public List<Integer> show(){
        return numbers;
    }

    public static void main(String[] args) {

        Sum sum = new Sum();

        sum.addNumber(3);
        sum.addNumber(2);
        sum.addNumber(5);
        sum.addNumber(6);
        sum.addNumber(2);

        System.out.println(sum.evaluateSum(sum.numbers));
        System.out.println(sum.FindBiggestNumber());
        System.out.println(sum.FindSmallerNumber());
        System.out.println(sum.show());
    }
}
