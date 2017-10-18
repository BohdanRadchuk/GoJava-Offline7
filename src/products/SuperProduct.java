package products;

public abstract class SuperProduct {
    int id;
    String name;
    int amount;
    String description;
    int price;

    public SuperProduct(int id, String name, int amount, String description, int price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.description = description;
        this.price = price;
    }
}
