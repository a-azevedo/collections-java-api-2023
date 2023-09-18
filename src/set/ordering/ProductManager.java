package set.ordering;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductManager {
    Set<Products> products;

    public ProductManager(){
        products = new HashSet<>();
    }

    public void addProduct(long cod, String name, double price, int amount){
        products.add(new Products(cod,name,price,amount));
    }

    public Set<Products> getProductsInAlphabeticalOrder(){
        return new TreeSet<>(products);
    }

    public Set<Products> getAllProductsByPrice(){
        Set<Products> productsByPrice = new TreeSet<>(new Products.ComparatorByProductPrice());
        productsByPrice.addAll(products);
        return productsByPrice;
    }

    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.addProduct(456, "Iphone 14", 7999d, 20);
        pm.addProduct(895, "Alicate", 8d, 150);
        pm.addProduct(147, "Roteador", 100d, 30);
        pm.addProduct(856, "Monitor", 2199d, 40);
        pm.addProduct(776, "Teclado", 120d, 200);
        System.out.println(pm.getProductsInAlphabeticalOrder());
        System.out.println(pm.getAllProductsByPrice());
    }
}
