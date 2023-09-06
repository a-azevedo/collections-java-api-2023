package shopping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {

    List<Item> items;

    public Cart(){
        items = new ArrayList<>();
    }

    public void addItem(String name, Double price, int amount){
        items.add(new Item(name,price,amount));
    }
    //Utilizando o método remove() da interface List
    //Remove a primeira ocorrência do elemento especificado da Lista. O elemento com menor indíce.
    //Pode lançar a exceção ConcurrentModificationException se for removido um elemento enquanto ainda está iterando
    //na lista.
    public void removeNamedItem(String name){
        for(Item item : this.items){
            if(item.getName().equalsIgnoreCase(name)){
                items.remove(item);
            }
        }
    }
    //Remove as ocorrências do array fazendo uso direto do Iterator e evitando a exceção ConcurrentModificationException
    public void removeByNameWithIterator(String name){
        for(Iterator<Item> iterator = items.iterator(); iterator.hasNext();){
            Item item = iterator.next();
            if(item.getName().equalsIgnoreCase(name)){
                iterator.remove();
            }
        }
    }
    //Remove todas as ocorrências especificadas
    public void removeAllByName(String name){
        List<Item> toRemove = new ArrayList<>();
        for(Item item : items){
            if(item.getName().equalsIgnoreCase(name)){
                toRemove.add(item);
            }
        }
        items.removeAll(toRemove);
    }
    //forma java 8+ de fazer. Utilizando os novos recursos de lambdas e programação funcional
    //Remove todas as ocorrências especificadas
    public void removeNamedItemRevamped(String name){
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }
    //Calcula o valor total considerando a quantidade de cada item
    public double evaluate(Cart cart){
        double total = 0d;
        for(Item item : cart.items){
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }
    //Mostra todos os items da lista.
    public void showShoppingCartDetails(){
        System.out.println(items);
    }
}
