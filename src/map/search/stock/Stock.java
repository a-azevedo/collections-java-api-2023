package map.search.stock;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {

    private Map<Long,Product> stock;

    public Stock(){
        stock = new HashMap<>();
    }

    public void addProduct(long cod, String name, double price, int amount){
        stock.put(cod, new Product(name,price,amount));
    }

    public void showAllProducts(){
        System.out.println(stock);
    }

    public Double evaluateTotalStockValue(){
        double totalStockValue = 0d;
        if(!stock.isEmpty()){
            for(Product p : stock.values()){
                totalStockValue += p.getPrice() * p.getAmount();
            }
        }
        return  totalStockValue;
    }

    public Product moreExpensiveProduct(){
        double maxPrice = Double.MIN_VALUE;
        Product moreExpensiveProduct = null;
        if(!stock.isEmpty()){
            for(Product p : stock.values()){
                if(p.getPrice() > maxPrice){
                    maxPrice = p.getPrice();
                }
                moreExpensiveProduct = p;
                break;
            }
        }
        return moreExpensiveProduct;
    }
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.addProduct(444L, "Xbox Series X", 4000d, 40);
        stock.addProduct(789L, "Ipad 10", 5500d, 20);
        stock.addProduct(272L, "RTX 4090", 11000d, 80);

        stock.showAllProducts();
        System.out.println(stock.evaluateTotalStockValue());
        System.out.println(stock.moreExpensiveProduct());
    }
}
