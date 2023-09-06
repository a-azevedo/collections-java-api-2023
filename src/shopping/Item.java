package shopping;

public class Item {
    private String name;
    private Double price;
    private int amount;

    public Item(String name, Double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "Produto: '" + name + '\'' +
                ", Preço: " + price +
                ", Quantidade: " + amount + "\n";
    }
}
