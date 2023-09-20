package map.search.stock;

import java.util.HashMap;
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
                    moreExpensiveProduct = p;
                }
            }
        }
        return moreExpensiveProduct;
    }

    public Product lessExpensiveProduct(){
        double minPrice = Double.MAX_VALUE;
        Product lessExpensiveProduct = null;
        for(Product p : stock.values()){
            if(p.getPrice() < minPrice){
                minPrice = p.getPrice();
                lessExpensiveProduct = p;
            }
        }
        return lessExpensiveProduct;
    }

    public Product lessImpactfullValueInStock(){
        double minValueInStock = Double.MAX_VALUE;
        Product lessExpensiveProduct = null;
        if(!stock.isEmpty()){
            for(Product p : stock.values()){
                if(p.getPrice() * p.getAmount() < minValueInStock){
                    minValueInStock = p.getPrice() * p.getAmount();
                    lessExpensiveProduct = p;
                }
            }
        }
        return lessExpensiveProduct;
    }

    public Product moreImpactfullValueInStock(){
        Product moreImpactfullInValue = null;
        double maxAgregatedValue = Double.MIN_VALUE;
        if(!stock.isEmpty()){
            for (Product p : stock.values()){
                if (p.getPrice() * p.getAmount() > maxAgregatedValue){
                    maxAgregatedValue = p.getPrice() * p.getAmount();
                    moreImpactfullInValue = p;
                }
            }
        }
        return moreImpactfullInValue;
    }
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.addProduct(444L, "Xbox Series X", 4000d, 40); //160000
        stock.addProduct(789L, "Ipad 10", 5500d, 200);       //110000
        stock.addProduct(272L, "RTX 4090", 11000d, 80);     //880000

        stock.showAllProducts();
        System.out.println(stock.evaluateTotalStockValue());
        System.out.println(stock.moreExpensiveProduct());
        System.out.println(stock.lessExpensiveProduct());
        System.out.println(stock.moreImpactfullValueInStock());
        System.out.println(stock.lessImpactfullValueInStock());
    }
}
