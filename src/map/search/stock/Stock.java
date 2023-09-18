package map.search.stock;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    Map<Long,Product> stock;

    public Stock(){
        stock = new HashMap<>();
    }

    public void addProduct(long cod, String name, double price, int amount){
        stock.put(cod, new Product(name,price,amount));
    }

    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.addProduct(444L, "Xbox Series X", 4000d, 40);
        stock.addProduct(789L, "Ipad 10", 5500d, 20);
        stock.addProduct(272L, "RTX 4090", 11000d, 80);

        System.out.println(stock.stock);
    }
}
