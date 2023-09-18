package set.ordering;

import java.util.Comparator;
import java.util.Objects;

public class Products implements Comparable<Products>{
    private final long cod;
    private final String name;
    private final double price;
    private  final int amount;

    public Products(long cod, String name, double price, int amount) {
        this.cod = cod;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products products)) return false;
        return cod == products.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    @Override
    public int compareTo(Products o) {
        return name.compareToIgnoreCase(o.getName());
    }

    @Override
    public String toString() {
        return "Products{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    private String getName() {
        return this.name;
    }

    static class ComparatorByProductPrice implements Comparator<Products> {

        @Override
        public int compare(Products o1, Products o2) {
            return Double.compare(o1.price, o2.price);
        }
    }
}
