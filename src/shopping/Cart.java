package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> items;

    public Cart(){
        items = new ArrayList<>();
    }

    public void addItem(String name, Double price, int amount){
        items.add(new Item(name,price,amount));
    }

    public void removeNamedItem(String name){
        for(Item item : this.items){
            if(item.getName().equalsIgnoreCase(name)){
                items.remove(item);
            }
        }
    }
    //forma java 8+ de fazer. Utilizando os novos recursos de lambdas e programação funcional
    public void removeNamedItemRevamped(String name){
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    public double evaluate(Cart cart){
        double total = 0d;
        for(Item item : cart.items){
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }

    public void showShoppingCartDetails(){
        System.out.println(items);
    }
}
